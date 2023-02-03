
package com.java.project.Project1.dto;

import com.java.project.Project1.model.Product;
import lombok.Data;

@Data
public class ProductIdDto {
    private Long idProduct;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public ProductIdDto() {
    }

    public ProductIdDto(Product product) {
        this.setIdProduct(product.getId());
    }
    
    
}
