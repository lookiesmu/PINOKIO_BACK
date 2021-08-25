package application.controller;

import application.domain.Order;
import application.domain.QOrder;
import application.domain.Store;
import application.repository.StoreRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static application.domain.QOrder.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloControllerTest {

    @Autowired
    StoreRepository storeRepository;

    @Test
    void asdf(){
        Store store = new Store("asdf","asdf");
        Store save = storeRepository.save(store);

        Assertions.assertThat(store.getBranchOffice()).isEqualTo(save.getBranchOffice());
    }
}