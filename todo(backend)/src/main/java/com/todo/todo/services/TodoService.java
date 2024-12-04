package com.todo.todo.services;

import com.todo.todo.model.Todo;
import com.todo.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;

    public List<Todo> getAllTodos() {
        return repo.findAll();
    }

    public Todo create(Todo todo) {
        return repo.save(todo);
    }

    public Todo update(String id, boolean completed) {
        Todo todo = repo.findById(id).orElseThrow();
        todo.setCompleted(completed);
        return repo.save(todo);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }

}
