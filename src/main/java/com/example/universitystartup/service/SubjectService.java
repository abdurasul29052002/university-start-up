package com.example.universitystartup.service;

import com.example.universitystartup.entity.Subject;
import com.example.universitystartup.mapper.SubjectMapper;
import com.example.universitystartup.model.SubjectModel;
import com.example.universitystartup.repository.SubjectRepository;
import com.example.universitystartup.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class SubjectService extends GenericService<Subject, SubjectModel, SubjectRepository, SubjectMapper> {
    public SubjectService(SubjectRepository repository, SubjectMapper mapper) {
        super(repository, mapper);
    }
}
