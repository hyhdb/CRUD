package com.example.CRUD.controller;

import com.example.CRUD.dto.PostDto;
import com.example.CRUD.entity.Post;
import com.example.CRUD.service.PostService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post create(@RequestBody PostDto dto) {
        return postService.create(dto);
    }

    @GetMapping
    public List<Post> getAll() {
        return postService.findAll();
    }
}
