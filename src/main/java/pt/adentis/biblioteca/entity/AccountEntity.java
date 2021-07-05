package pt.adentis.biblioteca.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "tb_depara_cosif_cargabal")
@EntityListeners(AuditingEntityListener.class)
public class AccountEntity extends RepresentationModel<AccountEntity> implements Serializable {

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String padrao;
    private String cosif;
    private String cargabal;

}
