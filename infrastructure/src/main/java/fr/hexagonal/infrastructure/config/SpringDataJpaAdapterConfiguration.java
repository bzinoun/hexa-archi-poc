package fr.hexagonal.infrastructure.config;

import fr.hexagonal.domain.spi.ProductPersistencePort;
import fr.hexagonal.infrastructure.adapter.ProductSpringJpaAdapter;
import fr.hexagonal.infrastructure.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDataJpaAdapterConfiguration {

    @Bean
    public ProductPersistencePort getProductPersistencPort(ProductRepository productRepository) {
        System.out.println("--------> Bean JPA Product");
    	return new ProductSpringJpaAdapter(productRepository);
    }
}
