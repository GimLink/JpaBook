package Link.JpaBook.model.entity.item;

import Link.JpaBook.model.entity.item.Item;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@DiscriminatorValue("M")
@Data
public class Movie extends Item {

    private String director;
    private String actor;
}
