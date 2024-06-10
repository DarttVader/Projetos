package com.ifruitcommerce.ifruit.repositories;

import com.ifruitcommerce.ifruit.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}