package com.example.universitystartup.mapper;

import com.example.universitystartup.entity.Teacher;
import com.example.universitystartup.mapper.template.GenericMapper;
import com.example.universitystartup.model.TeacherModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper extends GenericMapper<Teacher, TeacherModel> {



}
