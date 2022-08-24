package com.service;

import com.model.Task;
import com.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return (List<Task>) taskRepository.findAll();
    }

    @Override
    public void saveTask(Task task) {
        taskRepository.save(task);
    }
}
