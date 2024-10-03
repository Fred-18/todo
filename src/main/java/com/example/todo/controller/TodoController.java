package com.example.todo.controller;

import com.example.todo.model.TodoEntity;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value="/todo",produces = "application/json")

public class TodoController {
    @Autowired
    TodoService todoService;


@PostMapping("/create")
@ResponseStatus(HttpStatus.CREATED)
public void saveTodo(@RequestBody BodyForRequestBody body){
    todoService.createTodo(body.getTitle(),body.getDescription());
}
@GetMapping("/get/all")
    public Iterable<TodoEntity>getAllTodo(){
    return todoService.getAllTodo();
}
}
