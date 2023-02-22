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
@Table(name = "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull
    @Size(min = 3, max = 50,message = "name cannot be too short or too long")
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @Size(min = 3, max = 50,message = "lastname cannot be too short or too long")
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @NotNull
    @Size(min = 3, max = 50,message = "fatherName cannot be too short or too long")
    @Column(name = "father_name")
    private String nameOfFather;
    @NotNull
    @Column(name = "phone_number")
    private String phoneNumber;
    @NotNull
    @Size(min = 3, max = 50,message = "userName cannot be too short or too long")
    @Column(name = "user_name")
    private String userName;
    @NotNull
    @Size(min = 8, max = 50,message = "password should be between 8 and 50")
    @Column(name = "password")
    private String password;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private List<Subject> subject ;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group group;


}
