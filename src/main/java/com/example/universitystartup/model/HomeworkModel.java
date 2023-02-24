package com.example.universitystartup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeworkModel {
    private  Long id;
    private GroupModel grade;
    private GroupModel group;
    private SubjectModel subject;
    private  TeacherModel teacher;
}
