package application.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;

import javax.persistence.*;

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


    @JoinColumn(name="category_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;



}
