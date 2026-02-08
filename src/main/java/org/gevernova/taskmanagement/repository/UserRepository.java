package org.gevernova.taskmanagement.repository;

import org.gevernova.taskmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
