package org.taskManagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.State;
import org.taskManagement.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
	public List<Task> findByState(State state);
	public List<Task> findByName(String name);
}
