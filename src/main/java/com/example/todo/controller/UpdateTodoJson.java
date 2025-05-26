package com.example.todo.controller;

import java.util.Date;

public class UpdateTodoJson {

  private int id;
  private String title;
  private String description;
  private Date updatedAt;

  public UpdateTodoJson(
    int id,
    String title,
    String description,
    Date updatedAt
  ) {
    this.title = title;
    this.id = id;
    this.description = description;

    this.updatedAt = new Date();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public int getId() {
    return id;
  }
}
