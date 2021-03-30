package com.helion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helion.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
