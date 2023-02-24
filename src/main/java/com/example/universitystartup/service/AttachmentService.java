package com.example.universitystartup.service;

import com.example.universitystartup.entity.Attachment;
import com.example.universitystartup.mapper.AttachmentMapper;
import com.example.universitystartup.model.AttachmentModel;
import com.example.universitystartup.repository.AttachmentRepository;
import com.example.universitystartup.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class AttachmentService extends GenericService<Attachment, AttachmentModel, AttachmentRepository, AttachmentMapper> {
    public AttachmentService(AttachmentRepository repository, AttachmentMapper mapper) {
        super(repository, mapper);
    }
}
