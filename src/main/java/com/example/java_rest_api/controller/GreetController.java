package com.example.java_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
    public String getMessage(){
        return "<h2>  Hello from Spring Rest Controller </h2>";
    }

}
