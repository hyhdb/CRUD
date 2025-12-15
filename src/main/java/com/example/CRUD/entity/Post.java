package com.example.CRUD.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //계시글 ID(PK)

    private String title; //제목
    private String content; //내용

    public Long getId() { return id; }

    public String getTitle() { return title; }

    public String getContent() { return content; }

    public void setTitle(String title) { this.title = title; }

    public void setContent(String content) { this.content = content; }
}
