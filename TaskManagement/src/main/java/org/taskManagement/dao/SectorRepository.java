package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long>{

}
