package com.example.CRUD.service;

import com.example.CRUD.dto.UserRequest;
import com.example.CRUD.dto.UserResponse;
import com.example.CRUD.entity.User;
import com.example.CRUD.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(UserRequest request) {

        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());

        User saved = userRepository.save(user);

        return new UserResponse(saved.getId(), saved.getName(), saved.getAge());
    }
}
