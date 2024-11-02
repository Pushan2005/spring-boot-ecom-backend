package com.pushan.smallbasketbackend.service;

import com.pushan.smallbasketbackend.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "iPhone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Shure Mic", 10000)
    );

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getProdId() == id)
                .findFirst().get();
    }
}
