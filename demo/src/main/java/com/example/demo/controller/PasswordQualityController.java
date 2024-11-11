package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordQualityController {

    @GetMapping("/api/password-quality")
    public String checkPasswordQuality(@RequestParam String password) {
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")) {
            return "Password is strong";
        } else {
            return "Password is weak";
        }
    }
}

