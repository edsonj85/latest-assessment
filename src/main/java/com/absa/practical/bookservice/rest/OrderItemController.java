package com.absa.practical.bookservice.rest;

import com.absa.practical.bookservice.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orderitem")
public class OrderItemController {

    private final OrderItemService orderItemService;


    @DeleteMapping("/{orderItemId}")
    public void deleteOrderItemById(@PathVariable Long orderItemId) {
        orderItemService.deleteOrderItemById(orderItemId);
    }

}
