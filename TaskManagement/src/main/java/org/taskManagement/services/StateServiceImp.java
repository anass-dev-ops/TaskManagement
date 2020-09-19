package org.taskManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.StateRepository;
import org.taskManagement.entities.State;
@Service
public class StateServiceImp implements IStateService{
	
	@Autowired
	private StateRepository stateRepository;
	
	@Override
	public void saveState(State state) {
		stateRepository.save(state);
	}
}
