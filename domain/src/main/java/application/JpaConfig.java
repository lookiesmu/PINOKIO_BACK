package application;


import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

import javax.persistence.EntityManager;
import java.util.Optional;
import java.util.UUID;

@Configuration
@RequiredArgsConstructor
public class JpaConfig {

    private final EntityManager em;

    @Bean
    public JPAQueryFactory jpaQueryFactory(EntityManager em){
        return new JPAQueryFactory(em);
    }

    @Bean
    public AuditorAware<String> auditorAware(){
        return () -> Optional.of(UUID.randomUUID().toString());
    }



}
