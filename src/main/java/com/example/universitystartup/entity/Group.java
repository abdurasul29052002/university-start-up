package com.example.universitystartup.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;
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
    @NotNull
    @Size(min = 3, max = 50)
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
