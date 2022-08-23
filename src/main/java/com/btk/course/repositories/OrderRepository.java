package com.btk.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btk.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
