package com.ifruitcommerce.ifruit.repositories;

import com.ifruitcommerce.ifruit.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}