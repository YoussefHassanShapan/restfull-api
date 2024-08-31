package youssef.com.restfullapi.services;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import youssef.com.restfullapi.api.v1.mapper.CategoryMapper;
import youssef.com.restfullapi.api.v1.model.CategoryDTO;
import youssef.com.restfullapi.repositories.CategoryRepository;

import java.util.List;
import java.util.stream.Collectors;

//
// @Service
//@ComponentScan("youssef.com.restfullapi")
@Component
public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {

        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::categoryToCategoryDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryByName(String name) {
        return categoryMapper.categoryToCategoryDTO(categoryRepository.findByName(name));
    }
}
