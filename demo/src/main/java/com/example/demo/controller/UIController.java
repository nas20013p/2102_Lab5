package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {
    private final String[] questions = {
            "The sky is blue.",
            "The grass is green.",
            "Water is red.",
            "The sun rises in the east.",
            "Fire is cold.",
            "Snow is white.",
            "Bananas are pink.",
            "The ocean is deep.",
            "Mountains are tall.",
            "Birds can fly."
    };
    int questionIdx = 0;
    int score = 0;

    @GetMapping("/login")
    public String loginForm() {
        return "login";  
    }

    @GetMapping("/bad-password")
    public String badPasswordPage() {
        return "bad-password";  
    }

    @GetMapping("/quiz")
    public String quizPage(Model model) {
        System.out.println("IN THE UI CONTROLLER FOR /QUIZ");
        model.addAttribute("question", questions[questionIdx++]);
        model.addAttribute("score", String.valueOf(score++));
        return "quiz";  
    }
}



