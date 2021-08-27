package application.repository;

import application.domain.Category;
import application.domain.QCategory;
import application.domain.QStore;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import java.util.List;

import static application.domain.QCategory.*;
import static application.domain.QStore.*;


@RequiredArgsConstructor
public class CategoryRepositoryImpl implements CategoryRepositoryCustom{


    private final JPAQueryFactory query;


    @Override
    public List<Category> findByStoreId(Long id) {
        return query.select(category)
                .from(category)
                .join(category.store, store).fetchJoin()
                .where(store.id.eq(id))
                .fetch();
    }
}
