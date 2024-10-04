package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {

    public static void main(String[] args) throws JsonProcessingException {
        
        //Serialization of Java records
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = new Person("Alice", 20);
        String personJson = objectMapper.writeValueAsString(person);
        System.out.println(personJson);

        // Deserialization of Java records
        String json = "{\"name\":\"Bob\",\"age\":30}";
        Person deserializationPerson = objectMapper.readValue(json, Person.class);
        System.out.println(deserializationPerson);
    }
    
}
