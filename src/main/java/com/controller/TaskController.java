package com.controller;

import com.model.Task;
import com.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "renderFarmServer")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return taskService.findAll();
    }

    @GetMapping("saveTask")
    public void saveTask(Task task) {
        taskService.saveTask(task);
    }
}
