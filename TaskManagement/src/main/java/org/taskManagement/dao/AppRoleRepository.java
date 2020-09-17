package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.AppRole;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long>{

}
