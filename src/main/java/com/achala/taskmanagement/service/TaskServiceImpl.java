package com.achala.taskmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.achala.taskmanagement.model.Task;
import com.achala.taskmanagement.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	@Override
	public List<Task> getCompletedTasks() {
		return taskRepository.findByIsCompleted(true);
	}

	@Override
	public List<Task> getUncompletedTasks() {
		return taskRepository.findByIsCompleted(false);
	}

	@Override
	public Task getTaskById(Long id) {
		return taskRepository.findById(id).orElse(null);
	}

	@Override
	public Task createTask(Task task) {
		return taskRepository.save(task);
	}

	@Override
	public Task updateTask(Long id, Task updatedTask) {
		Task existing = taskRepository.findById(id).orElse(null);
        if (existing == null) return null;

        existing.setTaskName(updatedTask.getTaskName());
        existing.setDescription(updatedTask.getDescription());
        existing.setComleted(updatedTask.isComleted());

        return taskRepository.save(existing);
	}

	@Override
	public String deleteTask(Long id) {
		taskRepository.deleteById(id);
        return "Task deleted: " + id;
	}
	
}
