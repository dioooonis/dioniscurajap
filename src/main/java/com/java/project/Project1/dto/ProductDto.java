package com.java.project.Project1.dto;

import com.java.project.Project1.model.Product;
import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String code;
    private String name;
    private String description;
    private double price;
    private boolean enabled = true;

    public ProductDto() {
    }

    public ProductDto(Product product) {
        this.setId(product.getId());
        this.setCode(product.getCode());
        this.setName(product.getName());
        this.setDescription(product.getDescription());
        this.setPrice(product.getPrice());
        this.setEnabled(product.isEnabled());
    
    }
    
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    
    public void setCode(String code) {
        this.code = code;
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

  
    public double getPrice() {
        return price;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

   
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    
}
