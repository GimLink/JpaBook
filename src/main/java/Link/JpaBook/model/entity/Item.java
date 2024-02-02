package Link.JpaBook.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;
}