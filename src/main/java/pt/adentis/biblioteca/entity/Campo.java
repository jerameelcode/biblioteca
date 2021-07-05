package pt.adentis.biblioteca.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Data
@Entity(name = "tb_campo")
//@EntityListeners(AuditingEntityListener.class)
public class Campo extends RepresentationModel<Campo> {
    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_regra")
    private Regra regra;

    private String nome;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "padrao", name = "conta_padrao")
    private AccountEntity contaPadrao;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "padrao", name = "conta_resultado")
    private AccountEntity contaResultado;


}
