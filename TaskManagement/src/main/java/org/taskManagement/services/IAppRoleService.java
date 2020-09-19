package org.taskManagement.services;

import org.taskManagement.entities.AppRole;

public interface IAppRoleService {
	public void saveAppRole(AppRole appRole);
	public AppRole findRoleByName(String appRoleName);
	
}
