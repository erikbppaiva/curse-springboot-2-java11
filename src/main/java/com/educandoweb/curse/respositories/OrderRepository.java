package com.educandoweb.curse.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
