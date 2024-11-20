package com.grupo4.shopping_list_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ControllerProduct {

    private final ProductRepository PRODUCT_REPOSITORY;

    public ControllerProduct(ProductRepository productRepository) {
        PRODUCT_REPOSITORY = productRepository;

    }
    @GetMapping

    public List<Product> productList{

    }
}
