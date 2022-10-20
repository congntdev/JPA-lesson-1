package com.example.springjpalesson1.service;

import com.example.springjpalesson1.model.entity.Course;
import com.example.springjpalesson1.model.request.CourseRequest;

import java.util.List;

public interface CourseService {

    Course create(CourseRequest request);

    List<Course> getAll();

    Course getCourseById(Long id);

    Course update(Long id, CourseRequest request);

    String delete(Long id);

}
