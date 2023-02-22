package com.example.universitystartup.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AttachmentContentModel {
    private Long id;
    @JsonIgnore
    private byte [] content;
}
