package com.spring.react.springreactproject.service;

import com.spring.react.springreactproject.model.Student;

import java.util.List;

public interface StudentService {
        public Student saveStudent(Student student);
        public List<Student> getAllStudents();
}

