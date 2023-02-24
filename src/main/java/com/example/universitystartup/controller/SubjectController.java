package com.example.universitystartup.controller;

import com.example.universitystartup.controller.template.GenericController;
import com.example.universitystartup.entity.Subject;
import com.example.universitystartup.mapper.SubjectMapper;
import com.example.universitystartup.model.SubjectModel;
import com.example.universitystartup.repository.SubjectRepository;
import com.example.universitystartup.service.SubjectService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
public class SubjectController extends GenericController<Subject, SubjectModel, SubjectRepository, SubjectMapper, SubjectService> {
    public SubjectController(SubjectService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<SubjectModel> getAll(Pageable pageable) {
        return super.getAll(pageable);
    }
}
