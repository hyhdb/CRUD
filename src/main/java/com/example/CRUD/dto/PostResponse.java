package com.example.CRUD.dto;

public class PostResponse {

    private Long id;        // 게시글 번호
    private String title;   // 제목
    private String content; // 내용

    public PostResponse(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // Getter
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
