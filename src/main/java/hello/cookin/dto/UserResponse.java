package hello.cookin.dto;

import hello.cookin.entity.User;
import lombok.Getter;

@Getter
public class UserResponse {
    private Long userId;
    private String username;
    private String name;

    public UserResponse(User user) {
        this.userId = user.getUserId();
        this.username = user.getUsername();
        this.name = user.getName();
    }
}
