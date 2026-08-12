package com.andergi.brote.api.backend.controllers.http;

import com.andergi.brote.api.backend.ApplicationTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;


class StatusGetControllerShould extends ApplicationTestCase {
    @Test
    void check_if_service_is_running() throws Exception {
        this.assertResponse("/status", HttpStatus.OK.value(), "");
    }
}