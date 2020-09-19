package org.taskManagement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.taskManagement.entities.Project;
import org.taskManagement.services.IProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	private IProjectService iProjectService;

	@GetMapping("/projects")
	public List<Project> getProjects() {
		return iProjectService.findAllProjects();
	}
	
	@PostMapping("/saveProject")
	public String savePreject(@RequestBody Project project) {
		iProjectService.saveProject(project);
		return "Bien Fait";
	}
	
	@PutMapping("/updateProject")
	public String updateProject(@RequestBody Project project) {
		iProjectService.saveProject(project);
		return "Success";
	}
	
	@DeleteMapping("/deleteProject/{id}")
	public String deleteProject(@PathVariable Long id) {
		iProjectService.deleteProject(id);
		return "Delete Success";
	}
}
