package com.example.todo.controller;

import com.example.todo.model.TodoEntity;
import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

import java.util.Optional;

@RestController
@RequestMapping(value="/todo",produces = "application/json")

public class TodoController {
    @Autowired
    TodoService todoService;
    @Autowired
    private View error;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveTodo(@RequestBody TodoJson body) {
        todoService.createTodo(body.getTitle(), body.getDescription());
    }

    @GetMapping("/get/all")
    public Iterable<TodoEntity> getAllTodo() {
        return todoService.getAllTodo();
    }


    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable("id") int id) {
        todoService.deleteTodoById(id);
    }

    @PutMapping("update/{id}")
    public void updateTodo(@PathVariable("id") int id, @RequestBody UpdateTodoJson updateBody) {
        todoService.updateTodo(id,updateBody.getTitle(), updateBody.getDescription(),updateBody.getUpdatedAt());
    }

    @GetMapping("findTodo/{id}")
    public Optional fingToDoById(@PathVariable("id")int id){
         return todoService.getTodoById(id);
    }
}


