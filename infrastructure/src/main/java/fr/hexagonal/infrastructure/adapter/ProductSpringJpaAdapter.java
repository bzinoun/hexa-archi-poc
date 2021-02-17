package fr.hexagonal.infrastructure.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import fr.hexagonal.domain.model.Product;
import fr.hexagonal.domain.spi.ProductPersistencePort;
import fr.hexagonal.infrastructure.entity.ProductEntity;
import fr.hexagonal.infrastructure.repository.ProductRepository;

public class ProductSpringJpaAdapter implements ProductPersistencePort {


	private ProductRepository productRepository;

//	public ProductSpringJpaAdapter() {
//	}

	// @Autowired
    public ProductSpringJpaAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

	@Override
	public void addProduct(Product product) {
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(product, productEntity);
		productRepository.save(productEntity);
	}

	@Override
	public void removeProduct(Product product) {
		ProductEntity productEntity = new ProductEntity();
		BeanUtils.copyProperties(product, productEntity);
		productRepository.delete(productEntity);
	}

	@Override
	public List<Product> getProducts() {
		List<Product> productList = new ArrayList();
		List<ProductEntity> productEntityList = productRepository.findAll();
		productEntityList.forEach(productEntity -> {
			Product product = new Product();
			BeanUtils.copyProperties(productEntity, product);
			productList.add(product);
		});

		return productList;
	}

	@Override
	public Product getProductById(Integer productId) {
		return null;
	}
}
