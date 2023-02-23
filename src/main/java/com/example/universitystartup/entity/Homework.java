package com.example.universitystartup.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "homework")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    private Grade grade;

    @ManyToOne(optional = false)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group group;

    @ManyToOne(optional = false)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;
    @ManyToOne(optional = false)

    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;
}
