package org.taskManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.ProjectRepository;
import org.taskManagement.entities.Project;
@Service
public class ProjectServiceImp implements IProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public void saveProject(Project project) {
		projectRepository.save(project);
	}
	
	@Override
	public Project findProjectByName(String name) {
		return projectRepository.findByName(name);
	}

}
