package com.pushan.smallbasketbackend.service;

import com.pushan.smallbasketbackend.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "iPhone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Shure Mic", 10000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(p -> p.getProdId() == id)
                .findFirst().get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId())
                index = i;
        }
        products.set(index, prod);
    }

    public void deleteProduct(int id) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == id)
                index = i;
        }
        products.remove(index);
    }
}
