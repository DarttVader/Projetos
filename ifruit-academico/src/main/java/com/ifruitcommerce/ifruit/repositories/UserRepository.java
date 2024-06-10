package com.ifruitcommerce.ifruit.repositories;

import com.ifruitcommerce.ifruit.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
