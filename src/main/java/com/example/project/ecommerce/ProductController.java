package com.example.project.ecommerce;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final List<Product> productList = new CopyOnWriteArrayList<>();

    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }

    @PostMapping
    public String addProduct(@RequestBody Product product) {
        productList.add(product);
        return "Product added successfully";
    }
}


