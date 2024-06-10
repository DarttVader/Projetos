package com.ifruitcommerce.ifruit.repositories;

import com.ifruitcommerce.ifruit.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}