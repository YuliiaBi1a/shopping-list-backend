package com.grupo4.shopping_list_backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ControllerProduct {

    private final ProductRepository PRODUCT_REPOSITORY;

    public ControllerProduct(ProductRepository productRepository) {
        PRODUCT_REPOSITORY = productRepository;
    }

    @GetMapping
    public List<Product> productList(){
        return PRODUCT_REPOSITORY.findAll();
    }

    @PostMapping
    public ResponseEntity<?> postProduct(@RequestBody Product product){
        Optional<Product> optionalProduct = PRODUCT_REPOSITORY.findByName(product.getName());
        if(optionalProduct.isPresent()){
            return new ResponseEntity<>("The product already exist", HttpStatus.CONFLICT);
        }

        Product newProduct = PRODUCT_REPOSITORY.save(product);
        return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id){
        Optional<Product> optionalProduct = PRODUCT_REPOSITORY.findById(id);
        if(optionalProduct.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(optionalProduct.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProductById(@PathVariable Long id){
        Optional<Product> optionalProduct = PRODUCT_REPOSITORY.findById(id);
        if(optionalProduct.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        PRODUCT_REPOSITORY.deleteById(id);
        return new ResponseEntity<>("Product deleted.", HttpStatus.OK);
    }
}

