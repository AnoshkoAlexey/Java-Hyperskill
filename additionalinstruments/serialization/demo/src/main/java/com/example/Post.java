package com.example;

import java.util.Date;
import java.util.List;

public class Post {
    private int id;
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
    
}
