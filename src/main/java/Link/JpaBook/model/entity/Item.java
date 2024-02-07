package Link.JpaBook.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Item {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "items")
    private List<Category> catrgories = new ArrayList<Category>();

    private int price;
    private int stockQuantity;
}
