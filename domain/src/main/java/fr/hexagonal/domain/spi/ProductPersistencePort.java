package fr.hexagonal.domain.spi;

import fr.hexagonal.domain.model.Product;

import java.util.List;

public interface ProductPersistencePort {
   void addProduct(Product product);
   void removeProduct(Product product);
   List<Product> getProducts();
   Product getProductById(Integer productId);
}
