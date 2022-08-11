package com.studentrecord.studentsystem.service;

import com.studentrecord.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
