package org.taskManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.AppUserRepository;
import org.taskManagement.entities.AppUser;

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
}
