package com.achala.taskmanagement.service;

import java.util.List;

import com.achala.taskmanagement.model.Task;

public interface TaskService {
	List<Task> getAllTasks();

    List<Task> getCompletedTasks();

    List<Task> getUncompletedTasks();

    Task getTaskById(Long id);

    Task createTask(Task task);

    Task updateTask(Long id, Task updatedTask);

    String deleteTask(Long id);
}
