package com.srishti.Journal.App.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// this is only for health check like code is working or not

@RestController
public class HealthCheck {

    @GetMapping("/healthcheck")
    public String healthCheck(){
        return "ohk";
    }
}
