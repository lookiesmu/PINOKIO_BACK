package application.service;

import application.domain.Category;
import application.domain.Store;
import application.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional
public class StoreServiceImpl implements StoreService{

    private final StoreRepository storeRepository;

    @Override
    public List<Category> findStoreCategory(String storeName, String branch) {
        Optional<Store> result = storeRepository.findCategoryByBranchAndStoreName(storeName, branch);
        Store store = result.get();
        return store.getCategories();
    }
}
