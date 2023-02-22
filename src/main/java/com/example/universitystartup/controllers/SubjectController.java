package com.example.universitystartup.controllers;

import com.example.universitystartup.dtos.SubjectDTO;
import com.example.universitystartup.services.SubjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("subject/{id}")
    public SubjectDTO getSubjectById(@PathVariable Long id) {
        return subjectService.getSubjectById(id);
    }

    @GetMapping("subject/all")
    public Page<SubjectDTO> getAllSubjects(Pageable pageable) {
        return subjectService.getAllSubjects(pageable);
    }

    @PostMapping("subject")
    public SubjectDTO createSubject(@RequestBody SubjectDTO subject) {
        return subjectService.createSubject(subject);
    }

    @PutMapping("subject")
    public SubjectDTO updateSubject(@RequestBody SubjectDTO subject) {
        return subjectService.updateSubject(subject);
    }

    @DeleteMapping("subject")
    public Boolean deleteSubjectById(@RequestParam Long id) {
        return subjectService.deleteSubjectById(id);
    }

}
