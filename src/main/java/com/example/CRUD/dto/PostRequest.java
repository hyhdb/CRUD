package com.example.CRUD.dto;

public class PostRequest {

    private String title;   // 게시글 제목
    private String content; // 게시글 내용

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
