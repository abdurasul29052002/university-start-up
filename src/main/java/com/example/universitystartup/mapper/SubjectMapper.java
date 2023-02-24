package com.example.universitystartup.mapper;

import com.example.universitystartup.entity.Subject;
import com.example.universitystartup.mapper.template.GenericMapper;
import com.example.universitystartup.model.SubjectModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectMapper extends GenericMapper<Subject, SubjectModel> {


}
