package org.gevernova.taskmanagement.repository;

import org.gevernova.taskmanagement.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
