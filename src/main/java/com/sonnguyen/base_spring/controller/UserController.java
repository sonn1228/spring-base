package com.sonnguyen.base_spring.controller;

import com.sonnguyen.base_spring.model.User;
import com.sonnguyen.base_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build()); // Truy vấn người dùng theo ID
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user); // Tạo người dùng mới
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id); // Xóa người dùng theo ID
        return ResponseEntity.noContent().build();
    }
}
