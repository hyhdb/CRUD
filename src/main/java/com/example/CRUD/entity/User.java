package com.example.CRUD.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    public Long getId() { return id; }

    public String getName() { return name; }

    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }
}
