package com.example.universitystartup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeModel {
    private Long id;
    private StudentModel student;
    private HomeworkModel homework;
}
