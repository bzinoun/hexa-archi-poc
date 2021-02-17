package fr.hexagonal.infrastructure;

import fr.hexagonal.domain.model.Product;
import fr.hexagonal.domain.spi.ProductPersistencePort;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InfrastructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductPersistencePort productPersistencePort) {
        return args -> {
            productPersistencePort.addProduct(new Product(1, "Test", "Test"));

        };
    }

}
