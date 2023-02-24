package com.example.universitystartup.controller;

import com.example.universitystartup.controller.template.GenericController;
import com.example.universitystartup.entity.Faculty;
import com.example.universitystartup.mapper.FacultyMapper;
import com.example.universitystartup.model.FacultyModel;
import com.example.universitystartup.repository.FacultyRepository;
import com.example.universitystartup.service.FacultyService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController extends GenericController<Faculty, FacultyModel, FacultyRepository, FacultyMapper, FacultyService> {
    public FacultyController(FacultyService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<FacultyModel> getAll(Pageable pageable) {
        return super.getAll(pageable);
    }
}
