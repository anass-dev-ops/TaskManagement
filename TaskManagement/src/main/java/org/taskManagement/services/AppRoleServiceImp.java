package org.taskManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.AppRoleRepository;
import org.taskManagement.entities.AppRole;

@Service
public class AppRoleServiceImp implements IAppRoleService {
	
	@Autowired
	private AppRoleRepository appRoleRepository;
	
	@Override
	public void saveAppRole(AppRole appRole) {
		appRoleRepository.save(appRole);
	}


	@Override
	public AppRole findRoleByName(String appRoleName) {
		return appRoleRepository.findByName(appRoleName);
	}
}
