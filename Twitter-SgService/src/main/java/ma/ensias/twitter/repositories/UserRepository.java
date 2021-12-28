package ma.ensias.twitter.repositories;

import ma.ensias.twitter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
