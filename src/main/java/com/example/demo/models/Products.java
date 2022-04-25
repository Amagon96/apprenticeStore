package com.example.demo.models;

import java.math.BigDecimal;
import java.util.List;

public class Products {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private List<Categories> categories;

    public Products(Long id, String name, String description, BigDecimal price, List<Categories> categories) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categories = categories;
    }

    public Products(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Categories> getCategories() {
        return categories;
    }
}
