package fr.hexagonal.application.adapter;

import fr.hexagonal.application.service.ProductService;
import fr.hexagonal.domain.model.Product;
import fr.hexagonal.domain.spi.ProductPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceAdapter implements ProductService {

    private  ProductPersistencePort productPersistencePort;
   @Autowired
    public ProductServiceAdapter(ProductPersistencePort productPersistencePort) {
        this.productPersistencePort=productPersistencePort;
    }

    @Override
    public void save(Product product) {
        productPersistencePort.addProduct(product);
    }

    @Override
    public void remove(Product product) {
        productPersistencePort.removeProduct(product);
    }

    @Override
    public List<Product> getProducts() {
        return productPersistencePort.getProducts();
    }

    @Override
    public Product getProductById(Integer productId) {
        return null;
    }
}
