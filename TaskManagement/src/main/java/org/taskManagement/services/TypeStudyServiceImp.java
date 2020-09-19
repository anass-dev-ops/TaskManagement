package org.taskManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taskManagement.dao.TypeStudyRepository;
import org.taskManagement.entities.TypeStudy;
@Service
public class TypeStudyServiceImp implements ITypeStudyService{
	
	@Autowired
	private TypeStudyRepository typeStudyRepository;
	
	@Override
	public void saveTypeStudy(TypeStudy typeStudy) {
		typeStudyRepository.save(typeStudy);
	}
}
