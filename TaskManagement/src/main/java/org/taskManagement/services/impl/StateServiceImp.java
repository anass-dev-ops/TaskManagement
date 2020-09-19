package org.taskManagement.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.StateRepository;
import org.taskManagement.entities.State;
import org.taskManagement.services.IStateService;
@Service
public class StateServiceImp implements IStateService{
	
	@Autowired
	private StateRepository stateRepository;
	
	@Override
	public void saveState(State state) {
		stateRepository.save(state);
	}
}
