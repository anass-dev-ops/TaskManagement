package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.TypeStudy;

@Repository
public interface TypeStudyRepository extends JpaRepository<TypeStudy, Long>{

}
