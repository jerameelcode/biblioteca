package pt.adentis.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.adentis.biblioteca.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
