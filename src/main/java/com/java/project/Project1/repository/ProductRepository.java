
package com.java.project.Project1.repository;

import com.java.project.Project1.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    //QUERY BY METHOD NAME
    //find all products that have a name equals something
    List<Product> findByName(String name);
     //find all products that have a name like something
    List<Product> findByNameLike(String name);
    
    //JPQL
    @Query("select p from Product p where code = :code")
     List<Product> lookForName(String code);
     
     @Query("select p from Product p where name like :surname")
     List<Product> lookForSimilarName(String name);
     List<Product>searchincatalog(String detalil);
     
}
