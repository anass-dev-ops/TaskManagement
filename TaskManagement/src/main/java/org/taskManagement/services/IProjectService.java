package org.taskManagement.services;

import java.util.List;

import org.taskManagement.entities.Project;

public interface IProjectService {
	public void saveProject(Project project);
	public void deleteProject(Long id);
	public List<Project> findAllProjects();
	public Project findProjectByName(String name);
}
