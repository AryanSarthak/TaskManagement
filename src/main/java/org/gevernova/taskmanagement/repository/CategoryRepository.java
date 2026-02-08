package org.gevernova.taskmanagement.repository;

import org.gevernova.taskmanagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
