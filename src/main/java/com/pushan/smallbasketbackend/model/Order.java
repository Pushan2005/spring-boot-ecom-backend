package com.pushan.smallbasketbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    private int orderID;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "prodId", nullable = false)
    private Product product;

    public Order() {}
}
