package Link.JpaBook.model.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {

    private Date createdDate;
    private Date lastModifiedDate;
}
