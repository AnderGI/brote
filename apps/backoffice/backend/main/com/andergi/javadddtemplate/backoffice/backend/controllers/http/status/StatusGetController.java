package com.andergi.javadddtemplate.backoffice.backend.controllers.http.status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class StatusGetController {

    @GetMapping(path = "/status")
    public ResponseEntity run() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
