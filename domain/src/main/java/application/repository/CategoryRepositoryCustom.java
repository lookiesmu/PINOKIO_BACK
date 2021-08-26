package application.repository;

import application.domain.Category;

import java.util.List;

public interface CategoryRepositoryCustom {

    List<Category> findByStoreId(Long id);
}
