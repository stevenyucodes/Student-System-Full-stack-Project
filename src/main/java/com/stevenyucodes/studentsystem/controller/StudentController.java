package com.stevenyucodes.studentsystem.controller;

import com.stevenyucodes.studentsystem.model.student;
import com.stevenyucodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody student student){
        studentService.saveStudent(student);
        return "New student is added";

    }

    @GetMapping("/getAll")
    public List<student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
