package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "likes",
    "comments",
    "createdDate", // here you can also use 'postedAt'
    "content",
})
public class Post {

    @JsonIgnore
    private int id;

    @JsonProperty("postedAt")
    private Date createDate;
    private String content;
    private int likes;
    private List<String> comments;
    private Person person;

    // constructor, getters, setters    
    public Post(int id, Date createDate, String content, int likes, List<String> comments) {
        this.id = id;
        this.createDate = createDate;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }

    public Post() {}

    public Post(int id, Date createDate, String content, int likes, List<String> comments, Person person) {
        //TODO Auto-generated constructor stub
        this.id = id;
        this.createDate = createDate;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public List<String> getComments() {
        return comments;
    }

    @JsonProperty("createdDate")
    public String getReadableCreatedDate() {
        return (new SimpleDateFormat("dd-MM-yyyy")).format(createDate);
    }
    
}
