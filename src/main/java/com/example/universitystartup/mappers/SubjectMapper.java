package com.example.universitystartup.mappers;

import com.example.universitystartup.dtos.SubjectDTO;
import com.example.universitystartup.entities.Subject;

public class SubjectMapper {

    public static SubjectDTO toDTO(Subject entity) {
        return SubjectDTO
                .builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    public static Subject toEntity(SubjectDTO dto) {
        return new Subject()
                .id(dto.getId())
                .name(dto.getName());
    }

}
