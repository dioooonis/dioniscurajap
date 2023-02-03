package com.java.project.Project1.dto;

import com.java.project.Project1.model.Customer;
import lombok.Data;

@Data
public class CustomerIdDto {
    private Long idCustomer;

    public CustomerIdDto() {
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public CustomerIdDto(Customer customer) {
        this.setIdCustomer(customer.getId());
    }
    
    
}
