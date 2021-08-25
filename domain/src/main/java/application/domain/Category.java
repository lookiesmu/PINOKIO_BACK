package application.domain;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends BasicClass {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    @Column
    private String categoryName;

    @JoinColumn(name = "store_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;


    @OneToMany(mappedBy = "category")
    private List<Item> items = new ArrayList<>();
}
