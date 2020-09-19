package org.taskManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.SectorRepository;
import org.taskManagement.entities.Sector;

@Service
public class SectorserviceImp implements ISectorService{
	
	@Autowired
	private SectorRepository sectorRepository;
	
	@Override
	public void saveSector(Sector sector) {
		sectorRepository.save(sector);
	}
}
