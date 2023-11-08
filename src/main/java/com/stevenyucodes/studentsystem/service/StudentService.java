package com.stevenyucodes.studentsystem.service;

import com.stevenyucodes.studentsystem.model.student;

import java.util.List;

public interface StudentService {
    public student saveStudent(student student);
    public List<student> getAllStudents();
}
