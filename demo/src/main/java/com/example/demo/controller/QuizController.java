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

// @RestController
// public class QuizController {

//     private int currentQuestionIndex = 0;
//     private int score = 0;
//     private final String[] questions = {
//             "Is the sky usually blue?",
//             "Is water dry?",
//             "Is fire cold?"
//     };
//     private final boolean[] answers = {true, false, false};

//     @GetMapping("/api/quiz/question")
//     @ResponseBody
//     public Map<String, String> getQuestion() {
//         Map<String, String> response = new HashMap<>();
//         response.put("question", questions[currentQuestionIndex]);
//         response.put("score", String.valueOf(score));
//         return response;
//     }

//     @PostMapping("/api/quiz/answer")
//     public RedirectView submitAnswer(@RequestBody Map<String, String> payload) {
//         String answerStr = payload.get("answer");
//         boolean answer = Boolean.parseBoolean(answerStr);

//         if (answer == answers[currentQuestionIndex]) {
//             score++;
//         } 
//         // Redirect to the /quiz page
//         RedirectView redirectView = new RedirectView("/quiz");
//         redirectView.setStatusCode(HttpStatus.SEE_OTHER); // Ensures the method changes to GET
//         return redirectView;
//     }
// }


@Controller
public class QuizController {
    @PostMapping("/api/quiz/answer")
    public RedirectView quiz() {
        RedirectView redirectView = new RedirectView("/quiz");
        redirectView.setStatusCode(HttpStatus.SEE_OTHER);
        return redirectView;
    }
}
