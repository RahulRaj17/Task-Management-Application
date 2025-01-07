package com.rahul.task_management_app.controller;

import com.rahul.task_management_app.repository.TaskRepository;
import com.rahul.task_management_app.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
}
