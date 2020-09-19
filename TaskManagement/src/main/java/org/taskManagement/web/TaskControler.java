package org.taskManagement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taskManagement.entities.Task;
import org.taskManagement.services.ITasksService;

@RestController
public class TaskControler {

	@Autowired
	private ITasksService iTasksService;
	
	@GetMapping("/")
	public String getRoot() {
		return "Welcome";
	}
	
	@GetMapping("/tasks")
	public List<Task> getTasks() {
		return iTasksService.findAll();
	}
}
