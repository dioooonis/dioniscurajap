
package com.java.project.Project1.service1.impl;


import com.java.project.Project1.model.Product;
import com.java.project.Project1.repository.ProductRepository;
import com.java.project.Project1.service1.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductRepository productRepository;
    
    @Override
  public Product saveProduct(Product p){
      return productRepository.save(p);
      
  }
   @Override
   public void removeProduct(Product p) {
   productRepository.delete(p);
   
   }
   
   @Override
   public void removeAll(){
       productRepository.deleteAllInBatch();
   }

    @Override
    public Product findById(Long Id) throws NotFoundException {
      //  Optional<Product> oP= productRepository.findById(Id);
        //return oP.get();
       // Product prod=oP.orElseThrow(()-> new NotFoundException());
      //Product prod=oP.orElseThrow(NotFoundException::new);
      Product prod= productRepository.findById(Id)
             .orElseThrow(NotFoundException::new);
        return prod;
    }

}
