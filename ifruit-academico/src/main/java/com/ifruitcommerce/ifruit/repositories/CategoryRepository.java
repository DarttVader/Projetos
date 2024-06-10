package com.ifruitcommerce.ifruit.repositories;

import com.ifruitcommerce.ifruit.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}