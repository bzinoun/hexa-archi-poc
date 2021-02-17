package fr.hexagonal.application;

import fr.hexagonal.application.service.ProductService;
import fr.hexagonal.domain.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication

@ComponentScan(basePackages = " fr.hexagonal.**")

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
   }

//    @Bean
//    CommandLineRunner start(ProductService productService){
//        return args -> {
//           productService.save(new Product(1,"Test","Test"));
//
//        };
//
//    }


}
