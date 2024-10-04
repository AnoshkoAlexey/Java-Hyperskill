package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testMain() throws JsonProcessingException, ParseException {
        // Prepare test data with a fixed date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        Date fixedDate = formatter.parse("2023-12-28T10:00:00.000+0000"); 

        Post post = new Post(
                1,
                fixedDate,
                "I learned how to use jackson!",
                10,
                Arrays.asList("Well done!", "Great job!"));

        ObjectMapper objectMapper = new ObjectMapper();
        String expectedJson = objectMapper.writeValueAsString(post) + System.lineSeparator();

        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        Main.main(new String[]{});

        // Reset System.out
        System.setOut(originalOut);

        // Get the output from System.out
        String actualJson = outContent.toString();

        // Assertions
        assertEquals(expectedJson, actualJson);
    }
}
