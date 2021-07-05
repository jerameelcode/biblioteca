package pt.adentis.biblioteca.repository;

import pt.adentis.biblioteca.entity.Regra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegraRepository extends JpaRepository<Regra, Long> {
}
