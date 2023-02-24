package com.example.universitystartup.service;

import com.example.universitystartup.entity.Teacher;
import com.example.universitystartup.mapper.TeacherMapper;
import com.example.universitystartup.model.TeacherModel;
import com.example.universitystartup.repository.TeacherRepository;
import com.example.universitystartup.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends GenericService<Teacher, TeacherModel, TeacherRepository, TeacherMapper> {
    public TeacherService(TeacherRepository repository, TeacherMapper mapper) {
        super(repository, mapper);
    }
}
