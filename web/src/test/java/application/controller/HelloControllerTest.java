package application.controller;

import application.domain.QStore;
import application.domain.Store;
import application.repository.StoreRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static application.domain.QStore.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloControllerTest {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    JPAQueryFactory queryFactory;
    @Test
    void asdf(){

    }
}