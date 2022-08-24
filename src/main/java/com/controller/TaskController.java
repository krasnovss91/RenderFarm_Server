package com.controller;

import com.model.Task;
import com.repository.TaskRepository;
import com.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "renderFarmServer")
public class TaskController {

    private TaskService taskService;

    /*
    private TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

     */

    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
      //  return (List<Task>) taskRepository.findAll();
        return taskService.findAll();
    }

    @GetMapping("saveTask")
    public void saveTask(Task task) {
       // taskRepository.save(task);
        taskService.saveTask(task);
    }
}
