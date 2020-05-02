package com.mbsystems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZController {

    @GetMapping("/basil")
    public String basil() {
        return "ZZZBasil";
    }
}
