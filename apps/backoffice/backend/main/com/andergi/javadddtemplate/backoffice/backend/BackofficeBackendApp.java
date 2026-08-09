package com.andergi.javadddtemplate.backoffice.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.andergi.javadddtemplate.src.backoffice",
        "com.andergi.javadddtemplate.src.shared"
})
public class BackofficeBackendApp {
    public static void main(String[] args) {
        SpringApplication.run(BackofficeBackendApp.class, args);
    }
}
