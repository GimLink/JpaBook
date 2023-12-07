package Link.JpaBook.start;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="MEMBER")
@Data
public class Member {
    @Id
    @Column
    private String id;

    @Column(name="NAME")
    private String username;

    private Integer age;

}
