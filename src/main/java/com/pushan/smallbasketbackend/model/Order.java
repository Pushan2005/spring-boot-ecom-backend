package com.pushan.smallbasketbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Order {
    @Id
    private int orderID;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "prodId", nullable = false)
    private Product product;

    public Order() {}
}
