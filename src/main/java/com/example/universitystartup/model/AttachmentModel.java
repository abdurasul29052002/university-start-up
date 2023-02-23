package com.example.universitystartup.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AttachmentModel {
    private Long id;
    private String name;
    private String contentType;
    private Long size;
    private AttachmentContentModel attachmentContent;
}
