package org.taskManagement.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.AppUserRepository;
import org.taskManagement.entities.AppRole;
import org.taskManagement.entities.AppUser;
import org.taskManagement.services.IAppUserService;

@Service
public class AppUserServiceImp implements IAppUserService{
	
	@Autowired
	private AppUserRepository appUserRepository;
	
	@Override
	public void saveAppUser(AppUser appUser) {
		appUserRepository.save(appUser);
	}

	@Override
	public List<AppUser> findAllUsers() {
		return appUserRepository.findAll();
	}
	
	@Override
	public void addRolesToUser(List<AppRole> roles, AppUser appUser) {
		appUser.setAppRoles(roles);
		appUserRepository.save(appUser);
	}
}
