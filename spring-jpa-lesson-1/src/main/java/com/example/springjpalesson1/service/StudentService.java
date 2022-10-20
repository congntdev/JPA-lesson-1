package com.example.springjpalesson1.service;

import com.example.springjpalesson1.model.entity.Course;
import com.example.springjpalesson1.model.entity.Student;
import com.example.springjpalesson1.model.request.CourseRequest;
import com.example.springjpalesson1.model.request.StudentRequest;

import java.util.List;

public interface StudentService {

    Student create(StudentRequest request);

    List<Student> getAll();

    Student getStudentById(Long id);

    Student update(Long id, StudentRequest request);

    String delete(Long id);
}
