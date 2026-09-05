package com.andergi.brote.api.backend.controllers.http.linear_bar_code.scan;

import com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.application.scan.ProductLinearBarCodeScanner;
import com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.application.scan.ScanProductLineBarCodeCommand;
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
public final class ScanProductLinearBarCodePutController {

    private final ProductLinearBarCodeScanner scanner;
    private final Bucket bucket;

    public ScanProductLinearBarCodePutController(final ProductLinearBarCodeScanner scanner) {
        this.scanner = scanner;

        // 1. Build the bandwidth limit
        Bandwidth limit = Bandwidth.builder()
                .capacity(15)
                .refillGreedy(15, Duration.ofSeconds(1))
                .build();

        // 2. Assign the built Bucket to the instance field
        this.bucket = Bucket.builder()
                .addLimit(limit)
                .build();
    }

    @PutMapping(path = "/productLinearBarCodes/{linearBarCode}")
    public ResponseEntity  scan(@PathVariable final String linearBarCode) {
        if(bucket.tryConsume(1)) {
            this.scanner.scan(new ScanProductLineBarCodeCommand(linearBarCode));
            return ResponseEntity.status(HttpStatus.ACCEPTED).build();
        }
            return ResponseEntity.status(HttpStatus.TOO_MANY_REQUESTS).build();
    }
}
