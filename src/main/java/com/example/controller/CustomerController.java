package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @GetMapping("/index")
    public String index() {
        return "Hello, Customer index";
    }

    @GetMapping("/index2")
    public String index2() {
        return "Hello, Customer index2";
    }
}
