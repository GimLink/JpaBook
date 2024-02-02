package Link.JpaBook.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ORDER_ITEM")
@Data
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @Column(name = "ORDER_ID")
    private Long orderId;

    @Column(name = "ITEM_ID")
    private Long itemId;

    private int orderPrice;

    private int count;
}