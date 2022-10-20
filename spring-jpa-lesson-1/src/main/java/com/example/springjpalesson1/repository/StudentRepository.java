package com.example.springjpalesson1.repository;

import com.example.springjpalesson1.model.entity.Course;
import com.example.springjpalesson1.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentById(Long id);

    List<Student> findAll();

    List<Student> students = new ArrayList<>(){
    };
}
