package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.Task;

@Repository
public interface TeskRepository extends JpaRepository<Task, Long>{

}
