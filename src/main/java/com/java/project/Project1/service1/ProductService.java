
package com.java.project.Project1.service1;

import com.java.project.Project1.model.Product;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;


public interface ProductService {
    Product saveProduct(Product p);
    void removeProduct(Product p);
    void removeAll();   
    
    Product findById(Long Id) throws NotFoundException;
}
