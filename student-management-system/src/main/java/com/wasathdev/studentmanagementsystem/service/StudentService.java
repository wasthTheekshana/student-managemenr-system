package com.wasathdev.studentmanagementsystem.service;

import com.wasathdev.studentmanagementsystem.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
