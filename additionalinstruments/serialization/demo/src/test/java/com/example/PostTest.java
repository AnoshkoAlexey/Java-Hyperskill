package com.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void testPostCreation() {
        Date createDate = new Date();
        Post post = new Post(1, createDate, "Test content", 5, Arrays.asList("Comment 1", "Comment 2"));

        assertEquals(1, post.getId());
        assertEquals(createDate, post.getCreateDate());
        assertEquals("Test content", post.getContent());
        assertEquals(5, post.getLikes());
        assertEquals(Arrays.asList("Comment 1", "Comment 2"), post.getComments());
    }
}
