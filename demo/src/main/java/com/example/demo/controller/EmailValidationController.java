package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.http.HttpStatus;

@Controller
public class EmailValidationController {

    @GetMapping("/validate-email")
    public String showValidateEmailForm() {
        return "validate-email";
    }

    @PostMapping("/validate-email")
    public RedirectView validateEmail(@RequestParam String email) {
        if (email != null && email.contains("@") && email.endsWith(".com")) {
            // Redirect to the login page if the email is valid
            RedirectView redirectView = new RedirectView("/login");
            redirectView.setStatusCode(HttpStatus.SEE_OTHER);
            return redirectView;
        } else {
            // Redirect to the bad-email page
            RedirectView redirectView = new RedirectView("/bad-email");
            redirectView.setStatusCode(HttpStatus.SEE_OTHER);
            return redirectView;
        }
    }
    @GetMapping("/bad-email")
    public String showBadEmailPage() {
        return "bad-email";
    }
}






