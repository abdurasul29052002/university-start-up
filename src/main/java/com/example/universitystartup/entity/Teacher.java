package com.example.universitystartup.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.jetbrains.annotations.NotNull;
import java.util.List;
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Size(min = 3, max = 50)
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Size(min = 3, max = 50)
    @Column(name = "father_name", nullable = false)
    private String nameOfFather;
    @Size(min = 8, max = 50)
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;


    @ManyToOne(optional = false)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;

}
