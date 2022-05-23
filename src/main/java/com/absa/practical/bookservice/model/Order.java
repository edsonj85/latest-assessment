package com.absa.practical.bookservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "order", schema = "bookstore")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customer;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<OrderItem> orderItems;
    private BigDecimal orderTotal;
}
