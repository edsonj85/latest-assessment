package com.absa.practical.bookservice.dto;

import com.absa.practical.bookservice.model.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto {
    private Order order;
    private Long quantity;
    private BigDecimal itemTotal;
}
