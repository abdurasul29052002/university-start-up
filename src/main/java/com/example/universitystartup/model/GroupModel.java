package com.example.universitystartup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupModel {
    private Long id;

    private String name;

    private FacultyModel faculty;

}
