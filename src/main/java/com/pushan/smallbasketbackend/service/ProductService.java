package com.pushan.smallbasketbackend.service;

import com.pushan.smallbasketbackend.model.Product;
import com.pushan.smallbasketbackend.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProducts(int id) {
        return repo.findById(id).orElse(null);
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    private Product createNullProduct() {
        return new Product(0, "Doesn't exist", 0);
    }
}
