package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

    @JsonIgnore
    private int id;

    @JsonProperty("postedAt")
    private Date createDate;
    private String content;
    private int likes;
    private List<String> comments;

    // constructor, getters, setters    
    public Post(int id, Date createDate, String content, int likes, List<String> comments) {
        this.id = id;
        this.createDate = createDate;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
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
