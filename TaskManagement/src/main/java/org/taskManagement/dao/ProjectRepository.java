package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
