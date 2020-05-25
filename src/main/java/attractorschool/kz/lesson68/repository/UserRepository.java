package attractorschool.kz.lesson68.repository;


import attractorschool.kz.lesson68.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsBySession(String session);

    User findBySession(String session);
}
