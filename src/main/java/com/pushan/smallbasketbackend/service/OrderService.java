package com.pushan.smallbasketbackend.service;

import com.pushan.smallbasketbackend.model.Order;
import com.pushan.smallbasketbackend.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo repo;

    public List<Order> getOrders() { return repo.findAll(); }

    public Order getOrders(int id) { return repo.findById(id).orElse(null); }

    public void addOrder(Order order) { repo.save(order); }

    public void updateOrder(Order ord) { repo.save(ord); }

    public void deleteOrder(int id) { repo.deleteById(id); }

}
