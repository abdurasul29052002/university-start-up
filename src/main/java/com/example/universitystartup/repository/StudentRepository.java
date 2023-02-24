package com.example.universitystartup.repository;

import com.example.universitystartup.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
