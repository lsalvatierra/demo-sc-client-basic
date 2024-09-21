package com.la.demo_sc_client_basic.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @Value("${message:Default message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
