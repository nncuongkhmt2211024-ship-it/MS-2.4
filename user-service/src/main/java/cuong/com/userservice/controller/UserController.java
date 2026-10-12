package cuong.com.userservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import cuong.com.userservice.entity.User;
import cuong.com.userservice.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> getUsers() {
        return repository.findAll();
    }
}
