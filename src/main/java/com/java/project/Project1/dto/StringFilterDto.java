
package com.java.project.Project1.dto;

import com.java.project.Project1.model.Customer;
import lombok.Data;

@Data
public class StringFilterDto {
    private Long idCustomer;
    private String criterion;

    public StringFilterDto() {
    }

    public StringFilterDto(Customer customer) {
        this.setIdCustomer(customer.getId());
        this.setCriterion(criterion);
    }
    
    
}
