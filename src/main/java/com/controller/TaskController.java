package com.controller;

import com.model.Task;
import com.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "renderFarmServer")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
        return (List<Task>) taskRepository.findAll();
    }

    @GetMapping("saveTask")
    public void saveTask(Task task) {
        taskRepository.save(task);
    }
}
