package com.absa.practical.bookservice.repo;

import com.absa.practical.bookservice.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
