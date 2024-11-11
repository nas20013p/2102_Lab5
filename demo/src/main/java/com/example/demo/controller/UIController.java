package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {
     private final String[] questions = {
            "Is the sky usually blue?", // True
            "Is water dry?", // False
            "Is fire cold?", // False
            "Is the earth round?", // True
            "Do birds fly?", // True
            "Is the sun a star?", // True
            "Is ice hot?", // False
            "Can humans breathe underwater without equipment?", // False
            "Is chocolate sweet?", // True
            "Is the moon made of cheese?", // False
            "Do fish live in water?", // True
            "Is grass typically green?" // True
            
    };
    int questionIdx = 0;
    int score = 0;

    @GetMapping("/login")
    public String loginForm() {
        return "login";  // This should match the name of your HTML file: login.html
    }

    @GetMapping("/bad-password")
    public String badPasswordPage() {
        return "bad-password";  // This should match the name of your HTML file: bad-password.html
    }

    @GetMapping("/quiz")
    public String quizPage(Model model) {
        System.out.println("IN THE UI CONTROLLER FOR /QUIZ");
        model.addAttribute("question", questions[questionIdx++]);
        model.addAttribute("score", String.valueOf(score++));
        return "quiz";  // This should match the name of your HTML file: quiz.html
    }
}



