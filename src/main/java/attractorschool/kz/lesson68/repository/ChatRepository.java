package attractorschool.kz.lesson68.repository;



import attractorschool.kz.lesson68.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Integer> {
}
