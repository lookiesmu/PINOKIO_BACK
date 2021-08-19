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
public class Item extends BasicClass{

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;


    @Column
    private String itemName;

    @Column
    private Long price;


    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus;

    @JoinColumn(name = "store_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;

    @OneToMany(mappedBy = "item")
    @Column
    List<OrderItem> orderItemList = new ArrayList<>();


}
