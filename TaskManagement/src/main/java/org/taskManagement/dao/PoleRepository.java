package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.Pole;

@Repository
public interface PoleRepository extends JpaRepository<Pole, Long>{

}
