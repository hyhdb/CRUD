package com.example.CRUD.controller;

import com.example.CRUD.dto.PostDto;
import com.example.CRUD.dto.PostRequest;
import com.example.CRUD.dto.PostResponse;
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

    //게시글 생성
    @PostMapping
    public PostResponse create(@RequestBody PostRequest request) {
        return postService.create(request);
    }

    //게시글 전체 조회
    @GetMapping
    public List<PostResponse> getAll() {
        return postService.findAll();
    }

    //게시글 단건 조회
    @GetMapping("/{id}")
    public PostResponse getOne(@PathVariable("id") Long id) {
        return postService.findById(id);
    }

    //게시글 수정
    @PutMapping("/{id}")
    public PostResponse update(
            @PathVariable("id") Long id,
            @RequestBody PostRequest request
    ) {
        return postService.update(id, request);
    }

    //게시글 삭제
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        postService.delete(id);
    }
}
