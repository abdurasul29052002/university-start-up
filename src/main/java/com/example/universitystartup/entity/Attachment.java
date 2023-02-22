package com.example.universitystartup.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
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
    @Size(min = 3, max = 50)
    private String name;
    private String contentType;

    private Long size;


    @OneToOne(optional = false)
    @JoinColumn(name = "attachmentContent_id", referencedColumnName = "id")
    private AttachmentContent attachmentContent;


}
