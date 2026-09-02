package com.andergi.brote.api.backend.controllers.http.linear_bar_code.scan;

import com.andergi.brote.api.backend.ApplicationTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class ScanProductLinearBarCodePutControllerShould extends ApplicationTestCase {

    @Test
    void scan_a_valid_linear_bar_code() throws Exception {
        this.assertRequest("PUT", "/productLinearBarCodes/8480017226938", HttpStatus.ACCEPTED.value());
    }

}