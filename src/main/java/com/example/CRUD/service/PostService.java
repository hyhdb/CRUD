package com.example.CRUD.service;

import com.example.CRUD.dto.PostDto;
import com.example.CRUD.dto.PostRequest;
import com.example.CRUD.dto.PostResponse;
import com.example.CRUD.entity.Post;
import com.example.CRUD.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    //게시글 생성
    public PostResponse create(PostRequest request) {

        Post post = new Post();
        post.setTitle(request.getTitle());
        post.setContent(request.getContent());

        Post saved = postRepository.save(post);
        return new PostResponse(
                saved.getId(),
                saved.getTitle(),
                saved.getContent()
        );
    }

    //게시글 전체 조회
    public List<PostResponse> findAll() {
        return postRepository.findAll()
                .stream()
                .map(post -> new PostResponse(
                        post.getId(),
                        post.getTitle(),
                        post.getContent()
                ))
                .toList();
    }

    //게시물 단건 조회
    public PostResponse findById(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("게시글이 존재하지 않습니다. id=" + id));

        return new PostResponse(
                post.getId(),
                post.getTitle(),
                post.getContent()
        );
    }

    //게시글 수정
    public PostResponse update(Long id, PostRequest request) {
        Post post = postRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("게시물이 존재하지 않습니다. id=" + id)
                );

        post.setTitle(request.getTitle());
        post.setContent(request.getContent());

        Post updated = postRepository.save(post);

        return new PostResponse(
                updated.getId(),
                updated.getTitle(),
                updated.getContent()
        );
    }

    //게시글 삭제
    public void delete(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("게시물이 존재하지 않습니다. id=" + id));

        postRepository.delete(post);
    }
}
