package com.learn.mongodb.mongodblearn.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class User {

    @Id
    private String id;

    @Indexed(unique = true)
    private String username;

    private String email;

    private List<Note> notes;

    public User(String username, String email, List<Note> notes) {
        this.username = username;
        this.email = email;
        this.notes = notes;
    }
}
