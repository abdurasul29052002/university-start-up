package com.example.universitystartup.service;

import com.example.universitystartup.entity.Group;
import com.example.universitystartup.mapper.GroupMapper;
import com.example.universitystartup.model.GroupModel;
import com.example.universitystartup.repository.GroupRepository;
import com.example.universitystartup.service.template.GenericService;
import org.springframework.stereotype.Service;

@Service
public class GroupService extends GenericService<Group, GroupModel, GroupRepository, GroupMapper> {
    public GroupService(GroupRepository repository, GroupMapper mapper) {
        super(repository, mapper);
    }
}
