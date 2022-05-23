package com.absa.practical.bookservice.rest;

import com.absa.practical.bookservice.dto.OrderDto;
import com.absa.practical.bookservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/save")
    public OrderDto saveOrUpdateOrder(@RequestBody OrderDto orderDto) {
        return orderService.saveOrUpdateOrder(orderDto);
    }

    @GetMapping("/{orderId}")
    public OrderDto findOrderByOrderId(@PathVariable Long orderId) {
        return orderService.findOrderByOrderId(orderId);
    }

    @GetMapping("/all")
    public List<OrderDto> findAllOrders() {
        return orderService.findAllOrders();
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrderByOrderId(@PathVariable Long orderId) {
        orderService.deleteOrderByOrderId(orderId);
    }
}
