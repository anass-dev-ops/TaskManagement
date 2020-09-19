package org.taskManagement.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.ProjectRepository;
import org.taskManagement.entities.Project;
import org.taskManagement.services.IProjectService;
@Service
public class ProjectServiceImp implements IProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public void saveProject(Project project) {
		projectRepository.save(project);
	}

	
	@Override
	public List<Project> findAllProjects() {
		return projectRepository.findAll();
	}
	
	@Override
	public Project findProjectByName(String name) {
		return projectRepository.findByName(name);
	}


	@Override
	public void deleteProject(Long id) {
		projectRepository.deleteById(id);
	}

}
