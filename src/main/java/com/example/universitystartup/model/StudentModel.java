package com.example.universitystartup.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String nameOfFather;
    private String userName;
    private String password;


    private GroupModel group;

}
