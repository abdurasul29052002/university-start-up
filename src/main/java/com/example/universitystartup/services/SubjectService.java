package com.example.universitystartup.services;

import com.example.universitystartup.dtos.SubjectDTO;
import com.example.universitystartup.mappers.SubjectMapper;
import com.example.universitystartup.repositories.SubjectRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public SubjectDTO getSubjectById(Long id) {
        return subjectRepository.findById(id).map(SubjectMapper::toDTO).orElseThrow();
    }

    public Page<SubjectDTO> getAllSubjects(Pageable pageable) {
        return subjectRepository.findAll(pageable).map(SubjectMapper::toDTO);
    }

    public SubjectDTO createSubject(SubjectDTO subject) {
        return SubjectMapper.toDTO(subjectRepository.save(SubjectMapper.toEntity(subject)));
    }

    public SubjectDTO updateSubject(SubjectDTO subject) {
        return SubjectMapper.toDTO(subjectRepository.save(SubjectMapper.toEntity(subject)));
    }

    public Boolean deleteSubjectById(Long id) {
        subjectRepository.deleteById(id);
        return true;
    }

}
