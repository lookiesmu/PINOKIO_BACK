package application.service;

import application.domain.Category;
import application.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public Long join(Category category){
        return categoryRepository.save(category).getId();
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(Long id){
        return categoryRepository.findById(id);
    }
    public void deleteById(Long id){
        Long find = categoryRepository.findById(id).get().getId();
        categoryRepository.deleteById(find);
    }

}
