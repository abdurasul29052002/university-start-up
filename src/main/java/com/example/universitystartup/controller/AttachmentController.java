package com.example.universitystartup.controller;

import com.example.universitystartup.controller.template.GenericController;
import com.example.universitystartup.entity.Attachment;
import com.example.universitystartup.mapper.AttachmentMapper;
import com.example.universitystartup.model.AttachmentModel;
import com.example.universitystartup.repository.AttachmentRepository;
import com.example.universitystartup.service.AttachmentService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/attachment")
public class AttachmentController extends GenericController<Attachment, AttachmentModel, AttachmentRepository, AttachmentMapper, AttachmentService> {
    public AttachmentController(AttachmentService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<AttachmentModel> getAll(Pageable pageable) {
        return super.getAll(pageable);
    }

}
