package com.example.universitystartup.controller;

import com.example.universitystartup.controller.template.GenericController;
import com.example.universitystartup.entity.Group;
import com.example.universitystartup.mapper.GroupMapper;
import com.example.universitystartup.model.GroupModel;
import com.example.universitystartup.repository.GroupRepository;
import com.example.universitystartup.service.GroupService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/group")
public class GroupController extends GenericController<Group, GroupModel, GroupRepository, GroupMapper, GroupService> {
    public GroupController(GroupService service) {
        super(service);
    }

    @Override
    @GetMapping
    public List<GroupModel> getAll(Pageable pageable) {
        return super.getAll(pageable);
    }
}
