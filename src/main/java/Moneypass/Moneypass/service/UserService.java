package Moneypass.Moneypass.service;

import Moneypass.Moneypass.entity.User;
import Moneypass.Moneypass.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 회원가입
    public User register(User user) {
        return userRepository.save(user);
    }

    // 전체 회원 조회
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // 아이디로 조회
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}