package com.example.universitystartup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String nameOfFather;
    private String phoneNumber;
    private SubjectModel subject;
}
