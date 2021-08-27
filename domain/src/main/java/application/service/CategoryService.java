package application.service;

import application.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public Long join(Category category);
    public List<Category> findAll();
    public Optional<Category> findById(Long id);
    public void deleteById(Long id);
}
