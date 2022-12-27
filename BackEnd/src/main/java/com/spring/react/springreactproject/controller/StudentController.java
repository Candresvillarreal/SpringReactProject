package com.spring.react.springreactproject.controller;

import com.spring.react.springreactproject.model.Student;
import com.spring.react.springreactproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //Using postman I can see if the post request is working and the data is added to the DataBase
    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student is added";
    }

    //Using postman I can see if the get request is working and the data is returned from the DataBas
    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


}
