package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    //using the method name jpa is able to fetch details from database
    //Can use a property
    //In spring this is called a query method
    //Spring 5 is using optional which is why it is being used here
    Optional<Category> findByDescription(String description);
}
