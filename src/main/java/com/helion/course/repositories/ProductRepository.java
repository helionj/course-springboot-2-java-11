package com.helion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helion.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
