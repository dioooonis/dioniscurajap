
package com.java.project.Project1.repository;
import com.java.project.Project1.model.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<Product, Long>{
    //JPQL
    @Query("select p from Product p where code = :code")
     List<Product> lookForCode(String code);
     @Query("select p from Product p where name like :name")
     List<Product> lookForSimilarName(String name);
    
     
}
