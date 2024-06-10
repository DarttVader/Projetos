package com.ifruitcommerce.ifruit.repositories;

import com.ifruitcommerce.ifruit.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}