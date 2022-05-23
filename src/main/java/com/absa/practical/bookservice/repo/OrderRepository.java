package com.absa.practical.bookservice.repo;

import com.absa.practical.bookservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
