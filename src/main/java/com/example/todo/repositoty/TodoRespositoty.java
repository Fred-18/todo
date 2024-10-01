package com.example.todo.repositoty;
import com.example.todo.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRespositoty extends JpaRepository<TodoEntity,Integer> { }
