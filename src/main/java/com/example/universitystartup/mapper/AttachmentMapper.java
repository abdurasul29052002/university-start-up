package com.example.universitystartup.mapper;

import com.example.universitystartup.entity.Attachment;
import com.example.universitystartup.mapper.template.GenericMapper;
import com.example.universitystartup.model.AttachmentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttachmentMapper extends GenericMapper<Attachment, AttachmentModel> {


}
