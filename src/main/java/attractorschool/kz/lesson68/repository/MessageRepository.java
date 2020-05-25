package attractorschool.kz.lesson68.repository;



import attractorschool.kz.lesson68.model.Chat;
import attractorschool.kz.lesson68.model.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    Page<Message> findAllByChat_Id(Pageable pageable, int chatId);
    List<Message> findAllByChat_Id(int chatId);
    void deleteByChat(Chat chat);
}
