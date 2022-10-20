package com.example.springjpalesson1.service;

import com.example.springjpalesson1.model.entity.Student;
import com.example.springjpalesson1.model.request.StudentRequest;
import com.example.springjpalesson1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(StudentRequest request) {
        Student student = new Student();
        student.setFullName(request.getFullName());
        student.setPhoneNumber(request.getPhoneNumber());
        student.setBirthDay(request.getBirthDay());
        repository.save(student);
        return student;
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Student update(Long id, StudentRequest request) {
        Student student = new Student();
        student.setFullName(request.getFullName());
        student.setPhoneNumber(request.getPhoneNumber());
        student.setBirthDay(request.getBirthDay());
        repository.save(student);
        return student;
    }

    @Override
    public String delete(Long id) {
        repository.deleteById(id);
        return "Successful deleted!";
    }
}
