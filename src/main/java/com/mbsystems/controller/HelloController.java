package com.mbsystems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Basil!6666";
    }
}
