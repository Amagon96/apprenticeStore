package com.example.demo.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Products;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    CategoryController categoryController = new CategoryController();

    List<Products> products = List.of(
            new Products(
                    1L,
                    "Adidas sports short",
                    "A short to exercise",
                    BigDecimal.valueOf(49.99),
                    Arrays.asList(categoryController.getCategory("sports"), categoryController.getCategory("clothing"))
            ),
            new Products(
                    2L,
                    "Nike sneakers",
                    "Nike running sneakers",
                    BigDecimal.valueOf(49.99),
                    Arrays.asList(categoryController.getCategory("sports"), categoryController.getCategory("clothing"))
            )
    );

    @GetMapping(value = "/get_products")
    public List<Products> getProducts() {
        return products;
    }

    @GetMapping("/get_product/{id}")
    public Products getProductById(@PathVariable("id") Long productId) {
        Products matchingProduct = null;
        for (Products product: products) {
            if (product.getId().equals(productId)) {
                matchingProduct = product;
            }
        }
        return matchingProduct;
    }


}
