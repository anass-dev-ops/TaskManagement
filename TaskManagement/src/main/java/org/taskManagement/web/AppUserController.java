package org.taskManagement.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taskManagement.entities.AppUser;
import org.taskManagement.services.IAppUserService;

@RestController
public class AppUserController {
	@Autowired
	private IAppUserService iAppUserService;

	@GetMapping("/users")
	public List<AppUser> getUsers() {
		return iAppUserService.findAllUsers();
	}
}
