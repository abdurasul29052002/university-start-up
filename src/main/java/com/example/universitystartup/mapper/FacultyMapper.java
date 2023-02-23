package com.example.universitystartup.mapper;

import com.example.universitystartup.entity.Faculty;
import com.example.universitystartup.mapper.template.GenericMapper;
import com.example.universitystartup.model.FacultyModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FacultyMapper extends GenericMapper<Faculty, FacultyModel> {
}
