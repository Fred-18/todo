package com.example.todo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.model.Status;
import com.example.todo.model.TodoEntity;
import com.example.todo.repositoty.TodoRepository;

@Service
public class TodoService {

  @Autowired
  TodoRepository todoRepository;

  public TodoEntity createTodo(String title, String description) {
    TodoEntity todo = new TodoEntity();
    todo.setTitle(title);
    todo.setDescription(description);
    todo.setStatus(Status.PENDING);
    todo.setCreatedAT(new Date());
    return todoRepository.save(todo);
  }

  public List<TodoEntity> getAllTodo() {
    return todoRepository.findAll();
  }

  public Optional<TodoEntity> getTodoById(int id) {
    return todoRepository.findById(id);
  }

  public TodoEntity updateTodo(
    int id,
    String title,
    String description,
    Date updateAt
  ) {
    Optional<TodoEntity> todoOpt = todoRepository.findById(id);
    if (todoOpt.isPresent()) {
      TodoEntity todo = todoOpt.get();
      todo.setTitle(title);
      todo.setDescription(description);
      todo.setCreatedAT(updateAt);
      return todoRepository.save(todo);
    } else {
      throw new RuntimeException("Todo not found");
    }
  }

  public void deleteTodoById(int id) {
    todoRepository.deleteById(id);
  }

  public void deleteByTitle(String title) {
    String titleToDelete = getTodoByTitle(title);
    todoRepository.deleteByTitle(titleToDelete);
  }

  /* public TodoRepository getTodoRepository() {
    return todoRepository;
  }

  public void setTodoRepository(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  } */

  private String getTodoByTitle(String title) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
