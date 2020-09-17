package org.taskManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.taskManagement.entities.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
