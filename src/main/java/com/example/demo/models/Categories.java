package com.example.demo.models;

public class Categories {
    private long id;
    private String name;


    public Categories(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
