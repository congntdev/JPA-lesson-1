package com.example.springjpalesson1.repository;

import com.example.springjpalesson1.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<Course> findById(Long Id);

    List<Course> findAll();

    List<Course> courses = new ArrayList<>(){
    };
}
