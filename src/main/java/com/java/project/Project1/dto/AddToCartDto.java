
package com.java.project.Project1.dto;

import com.java.project.Project1.model.CartQty;
import lombok.Data;

@Data
public class AddToCartDto {
    
    private Integer quantity;
  
    public Integer getQuantity() {
        return quantity;
    }
   
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public AddToCartDto(Integer quantity) {
        this.quantity = quantity;
    }
  

    public AddToCartDto(CartQty cartQty) {
       
        this.setQuantity(cartQty.getQuantity());
    }
   
}