package com.absa.practical.bookservice.service;

import com.absa.practical.bookservice.dto.OrderDto;
import com.absa.practical.bookservice.mapper.BookStoreMapper;
import com.absa.practical.bookservice.model.Author;
import com.absa.practical.bookservice.model.Order;
import com.absa.practical.bookservice.repo.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final BookStoreMapper bookStoreMapper;

    public void deleteOrderByOrderId(Long orderId) {
        orderRepository.deleteById(orderId);
    }

    public List<OrderDto> findAllOrders() {
        var orders = orderRepository.findAll();
        return orders
                .stream()
                .map(order -> bookStoreMapper.mapOrderToOrderDto(order))
                .collect(Collectors.toList());
    }

    public OrderDto findOrderByOrderId(Long orderId) {
        var order = orderRepository.findById(orderId).orElse(null);
        return Objects.nonNull(order) ? bookStoreMapper.mapOrderToOrderDto(order) : null;
    }

    public OrderDto saveOrUpdateOrder(OrderDto orderDto) {
        var order = bookStoreMapper.mapOrderDtoToOrder(orderDto);
        var savedOrder = orderRepository.save(order);
        return bookStoreMapper.mapOrderToOrderDto(savedOrder);
    }
}
