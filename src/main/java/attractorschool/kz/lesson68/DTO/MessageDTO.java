package attractorschool.kz.lesson68.DTO;

import attractorschool.kz.lesson68.model.Message;
import lombok.*;

import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class MessageDTO {

    public static MessageDTO from(Message message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return builder()
                .id(message.getId())
                .userName(message.getUser().getName())
                .session(message.getUser().getSession())
                .text(message.getText())
                .time(message.getTime().format(formatter))
                .build();
    }
    private int id;
    private String session;
    private String userName;
    private String text;
    private String time;
}
