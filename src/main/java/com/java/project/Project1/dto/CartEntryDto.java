package com.java.project.Project1.dto;

import com.java.project.Project1.model.Cart;
import com.java.project.Project1.model.CartQty;
import com.java.project.Project1.model.Product;
import lombok.Data;

@Data
public class CartEntryDto {
    private Long idProduct;
    private Long idCartQty;
    private String code;
    private String name;
    private double price;
    private double qty;
    private double total;

    public CartEntryDto() {
    }

    public CartEntryDto(Long idProduct, Long idCartQty, String code, String name, double price, double qty, double total) {
        this.idProduct = idProduct;
        this.idCartQty = idCartQty;
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.total = total;
    }

   
    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getIdCartQty() {
        return idCartQty;
    }

    public void setIdCartQty(Long idCartQty) {
        this.idCartQty = idCartQty;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
           
}
