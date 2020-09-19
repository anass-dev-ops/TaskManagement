package org.taskManagement.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.SectorRepository;
import org.taskManagement.entities.Sector;
import org.taskManagement.services.ISectorService;

@Service
public class SectorserviceImp implements ISectorService{
	
	@Autowired
	private SectorRepository sectorRepository;
	
	@Override
	public void saveSector(Sector sector) {
		sectorRepository.save(sector);
	}

	@Override
	public void deleteSector(Long id) {
		sectorRepository.deleteById(id);
	}

	@Override
	public List<Sector> findAllSectors() {
		return sectorRepository.findAll();
	}
}
