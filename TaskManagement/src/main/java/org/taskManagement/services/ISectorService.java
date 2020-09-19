package org.taskManagement.services;

import java.util.List;

import org.taskManagement.entities.Sector;

public interface ISectorService {
	public void saveSector(Sector sector);
	public void deleteSector(Long id);
	public List<Sector> findAllSectors();
}
