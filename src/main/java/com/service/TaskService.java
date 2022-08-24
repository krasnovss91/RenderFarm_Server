package com.service;

import com.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> findAll();

    void saveTask(Task task);
}
