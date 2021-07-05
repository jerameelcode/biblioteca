package pt.adentis.biblioteca.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Data
@Entity(name = "tb_category")
@EntityListeners(AuditingEntityListener.class)
public class Category extends RepresentationModel<Category> {
    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
