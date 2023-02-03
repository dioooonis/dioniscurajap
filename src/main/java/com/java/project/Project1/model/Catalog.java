package com.java.project.Project1.model;

import lombok.Data;

@Data
public class Catalog extends Product{

    public Catalog() {
    }

    public Catalog(Long id, String code, String name, String description, double price) {
        super(id, code, name, description, price);
    }
    
}
