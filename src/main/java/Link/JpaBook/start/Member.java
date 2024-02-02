package Link.JpaBook.start;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="MEMBER")
@Data
public class Member {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name="NAME", nullable = false, length = 10)
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

}
