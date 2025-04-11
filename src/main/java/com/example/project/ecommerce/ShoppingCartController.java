package com.example.project.ecommerce;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
    private final List<Product> cartItems = new CopyOnWriteArrayList<>();

    @PostMapping("/add")
    public String addToCart(@RequestBody Product product) {
        cartItems.add(product);
        return product.getName() + " added to cart.";
    }

    @DeleteMapping("/remove")
    public String removeFromCart(@RequestBody Product product) {
        cartItems.remove(product);
        return product.getName() + " removed from cart.";
    }

    @GetMapping
    public List<Product> viewCart() {
        return cartItems;
    }
}

