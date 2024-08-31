package youssef.com.restfullapi.api.v1.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import youssef.com.restfullapi.api.v1.model.CategoryDTO;
import youssef.com.restfullapi.domain.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDTO(Category category);
}
