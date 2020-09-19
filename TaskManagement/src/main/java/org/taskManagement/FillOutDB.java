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
import org.taskManagement.entities.Task;
import org.taskManagement.entities.TypeStudy;
import org.taskManagement.services.IAppRoleService;
import org.taskManagement.services.IAppUserService;
import org.taskManagement.services.IPoleService;
import org.taskManagement.services.IProjectService;
import org.taskManagement.services.ISectorService;
import org.taskManagement.services.IStateService;
import org.taskManagement.services.ITasksService;
import org.taskManagement.services.ITypeStudyService;

@Component
public class FillOutDB implements CommandLineRunner{
	@Autowired
	IProjectService iProjectService;
	@Autowired
	ISectorService iSectorService;
	@Autowired
	ITasksService iTasksService;
	@Autowired
	IAppUserService iAppUserService;
	@Autowired
	IAppRoleService iAppRoleService;
	@Autowired
	IPoleService iPoleService;
	@Autowired
	ITypeStudyService iTypeStudyService;
	@Autowired
	IStateService iStateService;

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Project RIP 567", "Project PIO 900").forEach(projectName -> {
			Project project = new Project();
			project.setName(projectName);
			project.setStartDate(LocalDateTime.now());
			iProjectService.saveProject(project);
		});
		
		Stream.of("Secteur 1", "Secteur 2", "Secteur 3").forEach(sectorName -> {
			Sector sector = new Sector();
			sector.setName(sectorName);
			sector.setProject(iProjectService.findProjectByName("Project RIP 567"));
			iSectorService.saveSector(sector);
		});
		
		Stream.of("à traiter", "traitement en cours", "à contrôler",
				"contrôle en cours", "à livrer", "à reprendre", 
				"reprise en cours","livrée", "bloquée").forEach(stateName -> {
					State state = new State();
					state.setName(stateName);
					iStateService.saveState(state);
				});
		
		Stream.of("COMAC", "CAPFT").forEach(typeStudyName -> {
			TypeStudy typeStudy = new TypeStudy();
			typeStudy.setName(typeStudyName);
			iTypeStudyService.saveTypeStudy(typeStudy);
		});
		
		Stream.of("066BT0009","003BT0055","002BT0088","010BT0009").forEach(poleName -> {
			Pole pole = new Pole();
			pole.setName(poleName);
			pole.setType("BT");
			iPoleService.savePole(pole);
		});
		
		Stream.of("ADMIN", "SUPERVISOR", "RESPONSABLE").forEach(appRoleName -> {
			AppRole appRole = new AppRole();
			appRole.setName(appRoleName);
			iAppRoleService.saveAppRole(appRole);
		});
		
		List<AppRole> appRoles = new ArrayList<AppRole>();
		appRoles.add(iAppRoleService.findRoleByName("ADMIN"));
		appRoles.add(iAppRoleService.findRoleByName("SUPERVISOR"));
		appRoles.add(iAppRoleService.findRoleByName("RESPONSABLE"));
		
		AppUser appUser = new AppUser();
		appUser.setUsername("Superviseur");
		appUser.setAppRoles(appRoles);
		iAppUserService.saveAppUser(appUser);
		
		appRoles.clear();
		appRoles.add(iAppRoleService.findRoleByName("RESPONSABLE"));
		AppUser appUser1 = new AppUser();
		appUser1.setUsername("ChargeEtude");
		appUser1.setAppRoles(appRoles);
		iAppUserService.saveAppUser(appUser1);
		
		Stream.of("Reservation N1, 005",
				"Reservation N6, 011",
				"Reservation N9, 022").forEach(taskName -> {
			Task task = new Task();
			task.setName(taskName);
			task.setDescription("Description : "+taskName);
			task.setStartDate(LocalDateTime.now());
			task.setReleaseDate(LocalDateTime.of(2020, 9, 21, 12, 0));
			iTasksService.saveTask(task);
		});
		
	}

}
