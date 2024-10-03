package com.example.todo.controller;

public class BodyForRequestBody {
    private String title;
    private String description;


    public BodyForRequestBody(String title,String description){
        this.title=title;
        this.description=description;

    }

public String getTitle(){
        return title;
}
public String getDescription(){
        return description;
}
}

