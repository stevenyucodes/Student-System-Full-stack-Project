package com.stevenyucodes.studentsystem.service;

import com.stevenyucodes.studentsystem.model.student;
import com.stevenyucodes.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public student saveStudent(student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }
}
