package com.example.universitystartup.service;

import com.example.universitystartup.entity.AttachmentContent;
import com.example.universitystartup.mapper.AttachmentContentMapper;
import com.example.universitystartup.model.AttachmentContentModel;
import com.example.universitystartup.repository.AttachmentContentRepository;
import com.example.universitystartup.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class AttachmentContentService extends GenericService<AttachmentContent, AttachmentContentModel, AttachmentContentRepository, AttachmentContentMapper> {
    public AttachmentContentService(AttachmentContentRepository repository, AttachmentContentMapper mapper) {
        super(repository, mapper);
    }
}
