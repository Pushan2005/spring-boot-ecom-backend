package com.pushan.smallbasketbackend.service;

import com.pushan.smallbasketbackend.model.Order;
import com.pushan.smallbasketbackend.model.Product;
import com.pushan.smallbasketbackend.repository.OrderRepo;
import com.pushan.smallbasketbackend.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    ProductRepo productRepo;

    public List<Order> getOrders() { return orderRepo.findAll(); }

    public Order getOrders(int id) { return orderRepo.findById(id).orElse(createNullOrder()); }

    public void addOrder(Order order) {
        Product product = productRepo.findById(order.getProduct().getProdId()).orElseThrow(() -> new RuntimeException("Product not found"));
        Order ord = new Order(order.getOrderID(), order.getQuantity(), product);
        orderRepo.save(ord);
    }

    public void updateOrder(Order ord) { orderRepo.save(ord); }

    public void deleteOrder(int id) { orderRepo.deleteById(id); }

    private Order createNullOrder() {
        Product nullProd = new Product(0, "Doesn't Exist", 0);
        return new Order(0,0, nullProd);
    }

}
