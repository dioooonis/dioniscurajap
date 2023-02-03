
package com.java.project.Project1.service1.impl;


import com.java.project.Project1.dto.ProductDto;
import com.java.project.Project1.dto.StringFilterDto;
import com.java.project.Project1.model.Product;
import com.java.project.Project1.repository.CatalogRepository;
import com.java.project.Project1.service1.SearchInCatalogService;
import java.util.List;
import org.aspectj.apache.bcel.classfile.Code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SearchInCatalogServiceImpl implements SearchInCatalogService{
    @Autowired
    private CatalogRepository catalogRepository;


    @Override
    public Product lookForSimilarName(String name) throws NotFoundException {
    }

    @Override
    public Product lookForSimilarDescription(String description) throws NotFoundException {
        
    }

    @Override
    public List<ProductDto> lookForCode(StringFilterDto dto) {
         Product prod;
        prod = catalogRepository.lookForCode(Code).orElseThrow(NotFoundException::new);
        return prod; 
    }
    
    
}
