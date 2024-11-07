package com.pushan.smallbasketbackend.controller;

import com.pushan.smallbasketbackend.model.Order;
import com.pushan.smallbasketbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService service;

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return service.getOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable int id) {
        return service.getOrders(id);
    }

    @PostMapping("/orders")
    public void addOrder(@RequestBody Order order) {
        service.addOrder(order);
    }

    @PutMapping("/orders")
    public void updateOrder(@RequestBody Order ord) {
        service.updateOrder(ord);
    }

    @DeleteMapping("/orders/{id}")
    public void cancelOrder(@PathVariable int id) {
        service.deleteOrder(id);
    }
}
