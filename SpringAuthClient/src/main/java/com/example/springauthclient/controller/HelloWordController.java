package com.example.springauthclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/hello")
    public String helloWord() {
        return "Hello Word";
    }
}
