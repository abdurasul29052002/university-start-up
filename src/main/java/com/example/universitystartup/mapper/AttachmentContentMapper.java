package com.example.universitystartup.mapper;

import com.example.universitystartup.entity.AttachmentContent;
import com.example.universitystartup.mapper.template.GenericMapper;
import com.example.universitystartup.model.AttachmentContentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttachmentContentMapper extends GenericMapper<AttachmentContent, AttachmentContentModel> {

}
