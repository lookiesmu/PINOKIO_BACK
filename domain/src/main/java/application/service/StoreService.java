package application.service;

import application.domain.Category;

import java.util.List;

public interface StoreService {

    List<Category> findStoreCategory(String storeName, String branch);
}
