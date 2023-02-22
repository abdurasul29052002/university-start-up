package com.example.universitystartup.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    public Subject id(Long id) {
        this.id = id;
        return this;
    }

    public Subject name(String name) {
        this.name = name;
        return this;
    }

}
