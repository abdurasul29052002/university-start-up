package com.example.universitystartup.controller;

import com.example.universitystartup.controller.template.GenericController;
import com.example.universitystartup.entity.Teacher;
import com.example.universitystartup.mapper.TeacherMapper;
import com.example.universitystartup.model.TeacherModel;
import com.example.universitystartup.repository.TeacherRepository;
import com.example.universitystartup.service.TeacherService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController extends GenericController<Teacher, TeacherModel, TeacherRepository, TeacherMapper, TeacherService> {
    public TeacherController(TeacherService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<TeacherModel> getAll(Pageable pageable) {
        return super.getAll(pageable);
    }

}
