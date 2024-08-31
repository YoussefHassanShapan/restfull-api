package youssef.com.restfullapi.services;


import org.springframework.context.annotation.ComponentScan;
import youssef.com.restfullapi.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
