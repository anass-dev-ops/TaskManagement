package org.taskManagement.services;

import org.taskManagement.entities.Project;

public interface IProjectService {
	public void saveProject(Project project);
	public Project findProjectByName(String name);
}
