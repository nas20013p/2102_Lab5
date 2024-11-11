package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;



import java.util.HashMap;
import java.util.Map;


@Controller
public class QuizController {
    @PostMapping("/api/quiz/answer")
    public RedirectView quiz() {
        RedirectView redirectView = new RedirectView("/quiz");
        redirectView.setStatusCode(HttpStatus.SEE_OTHER);
        return redirectView;
    }
}
