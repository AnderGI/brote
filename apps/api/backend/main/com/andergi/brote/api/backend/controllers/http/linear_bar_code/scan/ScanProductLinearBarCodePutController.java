package com.andergi.brote.api.backend.controllers.http.linear_bar_code.scan;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class ScanProductLinearBarCodePutController {

    @PutMapping(path = "/linearBarCodes/{linearBarCode}")
    public ResponseEntity  scan(@PathVariable final String linearBarCode) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
