package com.example.universitystartup.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "attachment")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    private String contentType;

    private Long size;

    @OneToOne(optional = false)
    @JoinColumn(name = "attachmentContent_id", referencedColumnName = "id")
    private AttachmentContent attachmentContent;
}
