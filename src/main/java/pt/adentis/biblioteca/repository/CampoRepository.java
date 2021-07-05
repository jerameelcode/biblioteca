package pt.adentis.biblioteca.repository;

import pt.adentis.biblioteca.entity.Campo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampoRepository extends JpaRepository<Campo, Long> {
}
