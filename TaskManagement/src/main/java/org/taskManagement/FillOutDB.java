package org.taskManagement;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.taskManagement.entities.AppRole;
import org.taskManagement.entities.AppUser;
import org.taskManagement.entities.Pole;
import org.taskManagement.entities.Project;
import org.taskManagement.entities.Sector;
import org.taskManagement.entities.State;
import org.taskManagement.entities.TypeStudy;
import org.taskManagement.services.ITasksService;

@Component
public class FillOutDB implements CommandLineRunner{
	
	@Autowired
	ITasksService iTasksService;

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Project RIP 567", "Project PIO 900").forEach(projectName -> {
			Project project = new Project();
			project.setName(projectName);
			project.setStartDate(LocalDateTime.now());
			iTasksService.saveProject(project);
		});
		
		Stream.of("Secteur 1", "Secteur 2", "Secteur 3").forEach(sectorName -> {
			Sector sector = new Sector();
			sector.setName(sectorName);
			sector.setProject(iTasksService.findProjectByName("Project RIP 567"));
			iTasksService.saveSector(sector);
		});
		
		Stream.of("à traiter", "traitement en cours", "à contrôler",
				"contrôle en cours", "à livrer", "à reprendre", 
				"reprise en cours","livrée", "bloquée").forEach(stateName -> {
					State state = new State();
					state.setName(stateName);
					iTasksService.saveState(state);
				});
		
		Stream.of("COMAC", "CAPFT").forEach(typeStudyName -> {
			TypeStudy typeStudy = new TypeStudy();
			typeStudy.setName(typeStudyName);
			iTasksService.saveTypeStudy(typeStudy);
		});
		
		Stream.of("066BT0009","003BT0055","002BT0088","010BT0009").forEach(poleName -> {
			Pole pole = new Pole();
			pole.setName(poleName);
			pole.setType("BT");
			iTasksService.savePole(pole);
		});
		
		Stream.of("ADMIN", "SUPERVISOR", "RESPONSABLE").forEach(appRoleName -> {
			AppRole appRole = new AppRole();
			appRole.setName(appRoleName);
			iTasksService.saveAppRole(appRole);
		});
		
		List<AppRole> appRoles = new ArrayList<AppRole>();
		appRoles.add(iTasksService.findRoleByName("ADMIN"));
		appRoles.add(iTasksService.findRoleByName("SUPERVISOR"));
		appRoles.add(iTasksService.findRoleByName("RESPONSABLE"));
		
		AppUser appUser = new AppUser();
		appUser.setUsername("Superviseur");
		appUser.setAppRoles(appRoles);
		iTasksService.saveAppUser(appUser);
		
		appRoles.clear();
		appRoles.add(iTasksService.findRoleByName("RESPONSABLE"));
		AppUser appUser1 = new AppUser();
		appUser1.setUsername("ChargeEtude");
		appUser1.setAppRoles(appRoles);
		iTasksService.saveAppUser(appUser1);
		
	}

}
