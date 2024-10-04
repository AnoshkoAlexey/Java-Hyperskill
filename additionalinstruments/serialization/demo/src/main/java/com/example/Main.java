package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

        String inputJson = "{\"id\":1, \"createdDate\":1654027200000, \"content\":\"I learned how to use jackson!\", \"likes\":10, \"comments\":[\"Well done!\",\"Great job!\"]}\n";
        ObjectMapper objectMapper2 = new ObjectMapper();
        // Post post3 = objectMapper2.readValue(inputJson, Post.class);
        // System.out.println(post3);

        // Serialization of Lists of objects
        List<Post> posts = List.of(
            new Post(1, new Date(), "Content1", 10, Arrays.asList("Comment1", "Comment2")),
            new Post(2, new Date(), "Content2", 20, Arrays.asList("Comment3", "Comment4"))
        );

        String postsJson = objectMapper.writerWithDefaultPrettyPrinter()
            .writeValueAsString(posts);
        System.out.println(postsJson);

        // Deserialization of Lists of objects
        List<Post> deserializedPosts = objectMapper.readValue(postsJson, List.class);
        System.out.println(deserializedPosts);

        // Serialization of composed objects
        Post post4 = new Post(1, new Date(), "Content1", 10, Arrays.asList("Comment1", "Comment2"),
            new Person("Alice", 20));
        String postJson = objectMapper.writerWithDefaultPrettyPrinter()
            .writeValueAsString(post4);
        System.out.println(postJson);

        // Deserialization of composed objects 
        //Post deserializedPosts2 = objectMapper.readValue(postJson, Post.class);
        //System.out.println(deserializedPosts2);
    
        
    
    }
}