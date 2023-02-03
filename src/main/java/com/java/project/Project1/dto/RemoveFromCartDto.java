
package com.java.project.Project1.dto;

import com.java.project.Project1.model.CartQty;
import lombok.Data;

@Data
public class RemoveFromCartDto {
    private Long idQty;

    public RemoveFromCartDto() {
    }

   
    public Long getIdQty() {
        return idQty;
    }

    public void setIdQty(Long idQty) {
        this.idQty = idQty;
    }

    public RemoveFromCartDto(CartQty cartQty) {
        this.setIdQty(cartQty.getId());
    }
    
}
