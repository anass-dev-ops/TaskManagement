package org.taskManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.PoleRepository;
import org.taskManagement.dao.ProjectRepository;
import org.taskManagement.dao.SectorRepository;
import org.taskManagement.dao.StateRepository;
import org.taskManagement.dao.TaskRepository;
import org.taskManagement.dao.TypeStudyRepository;
import org.taskManagement.entities.Pole;
import org.taskManagement.entities.Project;
import org.taskManagement.entities.Sector;
import org.taskManagement.entities.State;
import org.taskManagement.entities.Task;
import org.taskManagement.entities.TypeStudy;

@Service
public class TaskServiceImp implements ITasksService{
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private TypeStudyRepository typeStudyRepository;
	@Autowired
	private PoleRepository poleRepository;
	@Autowired
	private ProjectRepository projectRepository;
	@Autowired
	private SectorRepository sectorRepository;
	@Autowired
	private TaskRepository taskRepository;
	@Override
	public void saveState(State state) {
		stateRepository.save(state);
	}

	@Override
	public void saveTypeStudy(TypeStudy typeStudy) {
		typeStudyRepository.save(typeStudy);
	}

	@Override
	public void savePole(Pole pole) {
		poleRepository.save(pole);
	}

	@Override
	public void saveProject(Project project) {
		projectRepository.save(project);
	}

	@Override
	public void saveSector(Sector sector) {
		sectorRepository.save(sector);
	}

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
