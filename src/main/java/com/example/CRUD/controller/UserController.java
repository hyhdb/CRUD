package com.example.CRUD.controller;

import com.example.CRUD.dto.ApiResponse;
import com.example.CRUD.dto.UserRequest;
import com.example.CRUD.dto.UserResponse;
import com.example.CRUD.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ApiResponse<UserResponse> create(@RequestBody UserRequest request) {
        return ApiResponse.ok(userService.create(request));
    }

    @GetMapping
    public ApiResponse<List<UserResponse>> getAll() {
        return ApiResponse.ok(userService.getAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<UserResponse> getOne(@PathVariable("id") Long id) {
        return ApiResponse.ok(userService.getOne(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<UserResponse> update(
            @PathVariable("id") Long id,
            @RequestBody UserRequest request
    ) {
        return ApiResponse.ok(userService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return ApiResponse.ok(null);
    }
}
