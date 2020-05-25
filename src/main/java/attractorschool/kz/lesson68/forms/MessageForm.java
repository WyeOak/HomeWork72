package attractorschool.kz.lesson68.forms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class MessageForm {
    private int chatId = 0;
    private String text = "";
    private String userName = "";
}
