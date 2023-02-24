package com.example.universitystartup.repository;

import com.example.universitystartup.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
