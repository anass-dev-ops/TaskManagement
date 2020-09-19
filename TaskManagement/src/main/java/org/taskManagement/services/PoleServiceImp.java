package org.taskManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.PoleRepository;
import org.taskManagement.entities.Pole;

@Service
public class PoleServiceImp implements IPoleService{
	
	@Autowired
	private PoleRepository poleRepository;
	
	@Override
	public void savePole(Pole pole) {
		poleRepository.save(pole);
	}
	
	@Override
	public List<Pole> findAllPoles() {
		return poleRepository.findAll();
	}
}
