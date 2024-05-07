package com.shahir.taskit.backend.model;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tasks")
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "urgency", nullable = false)
    private String urgency;

    @Column(name = "status", nullable = false)
    private String status;
}