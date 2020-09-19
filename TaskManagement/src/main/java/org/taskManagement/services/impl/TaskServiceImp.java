package org.taskManagement.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.AppRoleRepository;
import org.taskManagement.dao.AppUserRepository;
import org.taskManagement.dao.PoleRepository;
import org.taskManagement.dao.ProjectRepository;
import org.taskManagement.dao.SectorRepository;
import org.taskManagement.dao.StateRepository;
import org.taskManagement.dao.TaskRepository;
import org.taskManagement.dao.TypeStudyRepository;
import org.taskManagement.entities.AppRole;
import org.taskManagement.entities.AppUser;
import org.taskManagement.entities.Pole;
import org.taskManagement.entities.Project;
import org.taskManagement.entities.Sector;
import org.taskManagement.entities.State;
import org.taskManagement.entities.Task;
import org.taskManagement.entities.TypeStudy;
import org.taskManagement.services.ITasksService;

@Service
public class TaskServiceImp implements ITasksService{
	
	@Autowired
	private TaskRepository taskRepository;


	@Override
	public void saveTask(Task task) {
		taskRepository.save(task);
	}

	@Override
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	@Override
	public List<Task> findTasksByState(State state) {
		return taskRepository.findByState(state);
	}

	@Override
	public List<Task> findTasksByName(String name) {
		return taskRepository.findByName(name);
	}



}
