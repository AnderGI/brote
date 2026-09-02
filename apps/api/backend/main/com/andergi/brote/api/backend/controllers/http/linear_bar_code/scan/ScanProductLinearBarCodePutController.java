package com.andergi.brote.api.backend.controllers.http.linear_bar_code.scan;

import com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.application.scan.ProductLinearBarCodeScanner;
import com.andergi.javadddtemplate.src.backoffice.product_linear_bar_code.application.scan.ScanProductLineBarCodeCommand;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class ScanProductLinearBarCodePutController {

    private final ProductLinearBarCodeScanner scanner;

    public ScanProductLinearBarCodePutController(final ProductLinearBarCodeScanner scanner) {
        this.scanner = scanner;
    }

    @PutMapping(path = "/productLinearBarCodes/{linearBarCode}")
    public ResponseEntity  scan(@PathVariable final String linearBarCode) {
        this.scanner.scan(new ScanProductLineBarCodeCommand(linearBarCode));
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
