package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class Lab5UnitTests {

    @Autowired
    private MockMvc mockMvc;

    // @Test
    // void testGetNextQuizQuestion() throws Exception {
    //     mockMvc.perform(get("/api/quiz/question/testSession1"))
    //             .andExpect(status().isOk());
    // }

    // @Test
    // void testQuizCompletion() throws Exception {
    //     mockMvc.perform(get("/api/quiz/complete"))
    //             .andExpect(status().isOk());
    // }

    // @Test
    // void testSubmitQuizAnswerCorrect() throws Exception {
    //     mockMvc.perform(get("/api/quiz/submit/correct"))
    //             .andExpect(status().isOk());
    // }

    // @Test
    // void testSubmitQuizAnswerIncorrect() throws Exception {
    //     mockMvc.perform(get("/api/quiz/submit/incorrect"))
    //             .andExpect(status().isOk());
    // }
}
