package org.taskManagement.services;

import java.util.List;

import org.taskManagement.entities.Pole;

public interface IPoleService {
	public void savePole(Pole pole);
	public List<Pole> findAllPoles();
}
