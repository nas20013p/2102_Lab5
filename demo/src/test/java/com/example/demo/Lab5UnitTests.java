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

    @Test
    void testQuizCompletion() throws Exception {
        mockMvc.perform(get("/quiz"))
                .andExpect(status().isOk());
    }

    @Test
    void testLogin() throws Exception {
        mockMvc.perform(get("/login"))
                .andExpect(status().isOk());
    }

    @Test
    void testBadPassword() throws Exception {
        mockMvc.perform(get("/bad-password"))
                .andExpect(status().isOk());
    }

    @Test
    void testUnknownPage() throws Exception {
        mockMvc.perform(get("/unknownpage"))
                .andExpect(status().isNotFound());
    }
}
