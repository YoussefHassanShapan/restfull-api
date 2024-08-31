package youssef.com.restfullapi.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import youssef.com.restfullapi.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

}
