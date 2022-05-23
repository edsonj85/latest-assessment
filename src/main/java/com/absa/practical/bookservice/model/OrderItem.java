package com.absa.practical.bookservice.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Data
@Entity
@Table(name = "order_item", schema = "bookstore")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Order order;
    private Long quantity;
    private BigDecimal itemTotal;
    @OneToOne
    private Book book;
}
