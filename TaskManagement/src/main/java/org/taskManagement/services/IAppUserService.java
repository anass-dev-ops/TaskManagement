package org.taskManagement.services;

import java.util.List;

import org.taskManagement.entities.AppUser;

public interface IAppUserService {
	public void saveAppUser(AppUser appUser);
	public List<AppUser> findAllUsers();
}
