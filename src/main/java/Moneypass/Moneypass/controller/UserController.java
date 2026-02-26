package Moneypass.Moneypass.controller;

import Moneypass.Moneypass.entity.User;
import Moneypass.Moneypass.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 회원가입
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    // 전체 회원 조회
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // 특정 회원 조회
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }
}