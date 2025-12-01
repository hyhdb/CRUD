package com.example.CRUD.service;

import com.example.CRUD.dto.PostDto;
import com.example.CRUD.entity.Post;
import com.example.CRUD.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post create(PostDto dto) {

        Post post = new Post();
        post.setTitle(dto.getTitle());
        post.setContent(dto.getContent());

        return postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
