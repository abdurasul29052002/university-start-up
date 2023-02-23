package com.example.universitystartup.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "group")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Student> students;

    @ManyToOne(optional = false)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @JsonIgnore
    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private List<Homework> homework;
}
