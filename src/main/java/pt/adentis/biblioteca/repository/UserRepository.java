package pt.adentis.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.adentis.biblioteca.entity.Book;
import pt.adentis.biblioteca.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
