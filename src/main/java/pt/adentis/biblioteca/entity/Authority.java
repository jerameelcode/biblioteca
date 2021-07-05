package pt.adentis.biblioteca.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "tb_authority")
@EntityListeners(AuditingEntityListener.class)
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    @OneToOne
    @JoinColumn(referencedColumnName = "email", name = "email")
    private User user;

}
