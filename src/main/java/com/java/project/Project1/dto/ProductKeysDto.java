
package com.java.project.Project1.dto;

import com.java.project.Project1.model.Customer;
import com.java.project.Project1.model.Product;
import lombok.Data;
@Data
public class ProductKeysDto {
    private Long idProduct;
    private Long idCustomer;

    public ProductKeysDto() {
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public ProductKeysDto(Product product,Customer customer) {
      this.setIdProduct(product.getId());
      this.setIdCustomer(customer.getId());
    }
    
    
}
