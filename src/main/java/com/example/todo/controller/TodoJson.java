package com.example.todo.controller;

public class TodoJson {
    private String title;
    private String description;

    public TodoJson(String title, String description){
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

