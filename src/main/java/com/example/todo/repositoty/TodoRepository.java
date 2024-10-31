package com.example.todo.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.model.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
  public void deleteByTitle(String titleToDelete);
}
