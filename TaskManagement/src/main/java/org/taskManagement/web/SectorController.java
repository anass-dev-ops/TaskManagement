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
import org.taskManagement.entities.Sector;
import org.taskManagement.services.ISectorService;

@RestController
public class SectorController {
	
	@Autowired
	private ISectorService iSectorService;
	
	@GetMapping("/getSectors")
	public List<Sector> getSectors(){
		return iSectorService.findAllSectors();
	}
	@PostMapping("/saveSector")
	public String saveSector(@RequestBody Sector sector) {
		iSectorService.saveSector(sector);
		return "Create Success";
	}
	@PutMapping("/updateSector")
	public String updateSector(@RequestBody Sector sector) {
		iSectorService.saveSector(sector);
		return "Update Success";
	}
	@DeleteMapping("/deleteSector")
	public String deleteSector(@PathVariable Long id) {
		iSectorService.deleteSector(id);
		return "Delete Success";
	}
}
