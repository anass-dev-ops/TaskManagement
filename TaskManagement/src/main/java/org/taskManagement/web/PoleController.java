package org.taskManagement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taskManagement.entities.Pole;
import org.taskManagement.services.IPoleService;
import org.taskManagement.services.ITasksService;

@RestController
public class PoleController {
	
	@Autowired
	private IPoleService iPoleService;
	
	@GetMapping("/poles")
	public List<Pole> getPoles() {
		return iPoleService.findAllPoles();
	}

}
