package com.example.demo.controllers;

import java.util.List;

import com.example.demo.models.Categories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    List<Categories> categories = List.of(
            new Categories(1L, "sports"),
            new Categories(2L, "clothing")
    );

    public Categories getCategory(String name) {
        Categories matchingCategory = null;
        for (Categories category : categories) {
            if (category.getName() == name) {
                matchingCategory = category;
            }
        }
        return matchingCategory;
    }

    @GetMapping
    public List<Categories> getCategories() {
        return categories;
    }
}
