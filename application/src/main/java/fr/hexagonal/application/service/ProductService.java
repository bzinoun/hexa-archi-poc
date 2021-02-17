package fr.hexagonal.application.service;

import fr.hexagonal.domain.model.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    void remove(Product product);
    List<Product> getProducts();
    Product getProductById(Integer productId);
}
