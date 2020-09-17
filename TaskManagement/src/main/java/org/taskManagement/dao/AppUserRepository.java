package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{

}
