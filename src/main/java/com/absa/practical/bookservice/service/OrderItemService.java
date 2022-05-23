package com.absa.practical.bookservice.service;

import com.absa.practical.bookservice.repo.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public void deleteOrderItemById(Long orderItemId) {
        orderItemRepository.deleteById(orderItemId);
    }

}
