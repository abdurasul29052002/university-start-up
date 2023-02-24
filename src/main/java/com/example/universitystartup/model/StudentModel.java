package com.example.universitystartup.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String nameOfFather;
    private String phoneNumber;
    private String userName;
    private String password;
    private GroupModel group;
    private List<SubjectModel> subjects;
}
