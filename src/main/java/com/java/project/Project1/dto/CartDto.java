
package com.java.project.Project1.dto;

import com.java.project.Project1.model.Cart;
import com.java.project.Project1.model.Customer;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data

public class CartDto {
    private Long id;
    private Long idCustomer;


    public CartDto() {
    }

    public CartDto(Long id, Long idCustomer) {
        this.id = id;
        this.idCustomer = idCustomer;
      
    }

 
   
   
   
}
