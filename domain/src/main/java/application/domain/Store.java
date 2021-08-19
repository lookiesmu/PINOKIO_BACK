package application.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Store extends BasicClass {

    @Id @GeneratedValue
    @Column(name = "store_id")
    private Long id;

    @Column
    private String storeName;

    @Column
    private String branchOffice;

    @OneToMany(mappedBy = "store")
    List<Item> itemList = new ArrayList<>();





}
