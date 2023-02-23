package com.example.universitystartup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "attachment_content")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class AttachmentContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "content")
    private byte[] content;

    @OneToOne(mappedBy = "attachmentContent", cascade =CascadeType.ALL)
    private Attachment attachment;
}
