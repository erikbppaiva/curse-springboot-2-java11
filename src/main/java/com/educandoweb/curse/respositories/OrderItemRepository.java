package com.educandoweb.curse.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
