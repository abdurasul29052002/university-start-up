package com.example.universitystartup.mapper;

import com.example.universitystartup.entity.Group;
import com.example.universitystartup.mapper.template.GenericMapper;
import com.example.universitystartup.model.GroupModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GroupMapper extends GenericMapper<Group, GroupModel> {

}
