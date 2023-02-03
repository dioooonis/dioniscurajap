
package com.java.project.Project1.repository;

import com.java.project.Project1.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

    
}
