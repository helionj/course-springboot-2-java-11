package com.helion.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helion.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
