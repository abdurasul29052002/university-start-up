package com.example.universitystartup.service;

import com.example.universitystartup.entity.Faculty;
import com.example.universitystartup.mapper.FacultyMapper;
import com.example.universitystartup.model.FacultyModel;
import com.example.universitystartup.repository.FacultyRepository;
import com.example.universitystartup.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class FacultyService extends GenericService<Faculty, FacultyModel, FacultyRepository, FacultyMapper> {
    public FacultyService(FacultyRepository repository, FacultyMapper mapper) {
        super(repository, mapper);
    }
}
