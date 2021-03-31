package com.helion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helion.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
