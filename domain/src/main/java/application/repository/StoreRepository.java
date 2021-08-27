package application.repository;


import application.domain.Category;
import application.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{

    Optional<Store> findCategoryByBranchAndStoreName(String branch, String storeName);
}
