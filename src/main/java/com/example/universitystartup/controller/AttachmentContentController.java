package com.example.universitystartup.controller;

import com.example.universitystartup.controller.template.GenericController;
import com.example.universitystartup.entity.AttachmentContent;
import com.example.universitystartup.mapper.AttachmentContentMapper;
import com.example.universitystartup.model.AttachmentContentModel;
import com.example.universitystartup.repository.AttachmentContentRepository;
import com.example.universitystartup.service.AttachmentContentService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/attachment-content")
public class AttachmentContentController extends GenericController<AttachmentContent, AttachmentContentModel, AttachmentContentRepository, AttachmentContentMapper, AttachmentContentService> {
    public AttachmentContentController(AttachmentContentService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<AttachmentContentModel> getAll(Pageable pageable) {
        return super.getAll(pageable);
    }
}
