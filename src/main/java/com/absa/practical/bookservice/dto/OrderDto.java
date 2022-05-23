package com.absa.practical.bookservice.dto;

import com.absa.practical.bookservice.model.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private String customer;
    private Set<OrderItem> orderItems;
    private BigDecimal orderTotal;
}
