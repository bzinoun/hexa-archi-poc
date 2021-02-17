package fr.hexagonal.application.config;

import fr.hexagonal.application.adapter.ProductServiceAdapter;
import fr.hexagonal.application.service.ProductService;
import fr.hexagonal.domain.spi.ProductPersistencePort;
import fr.hexagonal.infrastructure.adapter.ProductSpringJpaAdapter;
import fr.hexagonal.infrastructure.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
   // private ProductRepository productRepository;



    @Bean
    public ProductService getProductService(ProductPersistencePort productPersistencePort) {
        return new ProductServiceAdapter(productPersistencePort);
    }

    @Bean
    public ProductPersistencePort getProductPersistencPort(ProductRepository productRepository) {
        return new ProductSpringJpaAdapter(productRepository);
    }

}
