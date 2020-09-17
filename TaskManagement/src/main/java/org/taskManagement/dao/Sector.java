package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sector extends JpaRepository<Sector, Long>{

}
