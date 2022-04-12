package com.example.demo.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Products;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    List<Products> products = List.of(new Products(
                1L,
                        "Short deportivo adidas",
                        "Un short para hacer ejercicio",
                BigDecimal.valueOf(49.99)), new Products(
                2L,
                        "Tenis Nike",
                        "Tenis para correr nike",
                BigDecimal.valueOf(49.99)));

    @GetMapping(value = "/get_products")
    public List<Products> getProducts() {
        return products;
    }

    @GetMapping("/get_product/{id}")
    public Long getProductById(@PathVariable("id") Long productId) {
        return productId;
    }


}
