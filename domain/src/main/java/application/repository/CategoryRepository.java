package application.repository;

import application.domain.Category;
import application.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>, CategoryRepositoryCustom{

    Optional<Category> findByCategoryName(String categoryName);

    List<Category> findByStoreId(Long id);


}
