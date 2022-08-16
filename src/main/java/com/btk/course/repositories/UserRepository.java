package com.btk.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btk.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
