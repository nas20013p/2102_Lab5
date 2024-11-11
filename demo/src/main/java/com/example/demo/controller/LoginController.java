package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.http.HttpStatus;


@Controller
public class LoginController {

    @PostMapping("/login")
    public RedirectView login(@RequestParam String username, @RequestParam String password) {
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")) {
            RedirectView redirectView = new RedirectView("/quiz");
            redirectView.setStatusCode(HttpStatus.SEE_OTHER);
            return redirectView;
        } else {
            RedirectView redirectView = new RedirectView("/bad-password");
            redirectView.setStatusCode(HttpStatus.SEE_OTHER);
            return redirectView;
        }
    }
}



