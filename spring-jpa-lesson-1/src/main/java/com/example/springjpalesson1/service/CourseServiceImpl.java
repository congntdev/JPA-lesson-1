package com.example.springjpalesson1.service;

import com.example.springjpalesson1.model.entity.Course;
import com.example.springjpalesson1.model.request.CourseRequest;
import com.example.springjpalesson1.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository repository;

    @Override
    public Course create(CourseRequest request) {
        Course course = new Course();
        course.setName(request.getName());
        course.setLecture(request.getLecture());
        course.setStartTime(request.getStartTime());
        course.setEndTime(request.getEndTime());
        repository.save(course);
        return course;
    }

    @Override
    public List<Course> getAll() {
        return repository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Course update(Long id, CourseRequest request) {
        Course course = repository.getReferenceById(id);
        course.setName(request.getName());
        course.setLecture(request.getLecture());
        course.setStartTime(request.getStartTime());
        course.setEndTime(request.getEndTime());
        repository.save(course);
        return course;
    }

    @Override
    public String delete(Long id) {
        repository.deleteById(id);
        return "Successful deleted!";
    }
}
