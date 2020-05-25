package attractorschool.kz.lesson68.DTO;



import attractorschool.kz.lesson68.model.User;
import lombok.*;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class UserDTO {

    public static UserDTO from(User user) {
        return builder()
                .id(user.getId())
                .session(user.getSession())
                .name(user.getName())
                .build();
    }

    private int id;
    private String session;
    private String name;
}
