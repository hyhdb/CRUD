package com.example.CRUD.controller;

import com.example.CRUD.dto.UserRequest;
import com.example.CRUD.dto.UserResponse;
import com.example.CRUD.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public UserResponse create(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }
}
