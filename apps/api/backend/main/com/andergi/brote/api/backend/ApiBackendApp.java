package com.andergi.brote.api.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication(scanBasePackages = {
        "com.andergi.brote.api.backend",
        "com.andergi.javadddtemplate.src.backoffice",
        "com.andergi.javadddtemplate.src.shared"
})
public class ApiBackendApp {
    public static void main(String[] args) {
        SpringApplication.run(ApiBackendApp.class, args);
    }

    @Bean
    public static RestClient restClient() {
        return RestClient.create();
    }

}
