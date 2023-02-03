
package com.java.project.Project1.service1;


import com.java.project.Project1.dto.ProductDto;
import com.java.project.Project1.dto.StringFilterDto;
import com.java.project.Project1.model.Product;
import java.util.List;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;


public interface SearchInCatalogService {
    
    List<ProductDto> lookForCode(StringFilterDto dto);
    Product lookForSimilarName(String name) throws NotFoundException;
    Product lookForSimilarDescription(String description) throws NotFoundException;
}
