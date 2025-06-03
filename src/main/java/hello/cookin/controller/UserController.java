package hello.cookin.controller;

import hello.cookin.dto.LoginRequest;
import hello.cookin.dto.UserJoinRequest;
import hello.cookin.dto.UserResponse;
import hello.cookin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public UserResponse register(@RequestBody UserJoinRequest joinRequest) {
        return userService.registerUser(joinRequest);
    }

    @PostMapping("/login")
    public UserResponse login(@RequestBody LoginRequest loginRequest) {
        return userService.loginUser(loginRequest.getUsername(), loginRequest.getPassword());
    }
}
