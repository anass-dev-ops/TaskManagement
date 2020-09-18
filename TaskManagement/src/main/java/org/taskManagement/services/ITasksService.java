package org.taskManagement.services;

import java.util.List;

import org.taskManagement.entities.AppRole;
import org.taskManagement.entities.AppUser;
import org.taskManagement.entities.Pole;
import org.taskManagement.entities.Project;
import org.taskManagement.entities.Sector;
import org.taskManagement.entities.State;
import org.taskManagement.entities.Task;
import org.taskManagement.entities.TypeStudy;

public interface ITasksService {
	public void saveState(State state);
	public void saveTypeStudy(TypeStudy typeStudy);
	public void savePole(Pole pole);
	public void saveProject(Project project);
	public Project findProjectByName(String name);
	public void saveSector(Sector sector);
	public void saveAppRole(AppRole appRole);
	public AppRole findRoleByName(String appRoleName);
	public void saveAppUser(AppUser appUser);
	
	public void saveTask(Task task);
	public List<Task> findAll();
	public List<Task> findTasksByState(State state);
	public List<Task> findTasksByName(String name);
}
