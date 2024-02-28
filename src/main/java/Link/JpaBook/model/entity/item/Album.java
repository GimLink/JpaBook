package Link.JpaBook.model.entity.item;

import Link.JpaBook.model.entity.item.Item;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("A")
@Data
public class Album extends Item {
    private String artist;
    private String etc;
}
