package com.example.todo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);

    Map<String, Integer> ages = new HashMap<>();

    ages.put("Fred", 39);
    System.out.println(ages);
  }
}
