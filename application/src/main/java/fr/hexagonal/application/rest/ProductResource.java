package fr.hexagonal.application.rest;

import fr.hexagonal.application.service.ProductService;
import fr.hexagonal.domain.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class ProductResource {


    private  ProductService productService;

    @Autowired(required = true)
    public ProductResource(@Qualifier("productServiceAdapter") ProductService productService) {
        this.productService=productService;
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getDepartements(){
        List<Product> products = productService.getProducts();
        return ResponseEntity.ok().body(products);
    }

    @PostMapping("/product")
    public ResponseEntity<Void> addProduct(@RequestBody Product product) {
        productService.save(product);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
