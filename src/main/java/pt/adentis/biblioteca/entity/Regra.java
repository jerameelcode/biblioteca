package pt.adentis.biblioteca.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "tb_regra")
@EntityListeners(AuditingEntityListener.class)
public class Regra extends RepresentationModel<Regra> {

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(
            mappedBy = "regra", cascade = CascadeType.DETACH
    )
    private List<Campo> campos;

}
