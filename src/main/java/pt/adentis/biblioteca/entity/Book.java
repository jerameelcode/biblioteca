package pt.adentis.biblioteca.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "tb_book")
@EntityListeners(AuditingEntityListener.class)
public class Book extends RepresentationModel<Book> {

    @Id
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer copies;
    private Boolean available;

    @OneToMany
    private List<Category> categories;

}
