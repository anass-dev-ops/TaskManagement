package org.taskManagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.taskManagement.entities.Task;

@SpringBootApplication
public class TaskManagementApplication{

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}

}
