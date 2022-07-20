package com.learn.mongodb.mongodblearn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Note {

    private String title;

    private String text;
}
