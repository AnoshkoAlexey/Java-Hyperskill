package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        // Step 1
        Post post = new Post(
            1,
            new Date(),
            "I learned how to use jackson!",
            10,
            Arrays.asList("Well done!", "Great job!"));

        // Step 2
        ObjectMapper objectMapper = new ObjectMapper();

        // Step 3
        String postAsString = objectMapper.writeValueAsString(post);

        System.out.println(postAsString);

        // Step 4
        String postAsString2 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(post);
        
        System.out.println(postAsString2);
    }
}