package youssef.com.restfullapi.controllers.v1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import youssef.com.restfullapi.api.v1.model.CategoryDTO;
import youssef.com.restfullapi.api.v1.model.CatorgoryListDTO;
import youssef.com.restfullapi.services.CategoryService;

@RestController
@RequestMapping(CategoryController.BASE_URL)

public class CategoryController {

    public static final String BASE_URL = "/api/v1/categories";

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CatorgoryListDTO getallCatetories(){
        return new CatorgoryListDTO(categoryService.getAllCategories());
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName(@PathVariable String name){
        return categoryService.getCategoryByName(name);
    }
}
