package com.springboot.first.app;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Ali", "Habibian"); // Returns Java Bean (as JSON) => default
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali-1", "Habibian-1"));
        students.add(new Student("Ali-2", "Habibian-2"));
        students.add(new Student("Ali-3", "Habibian-3"));
        students.add(new Student("Ali-4", "Habibian-4"));
        students.add(new Student("Ali-5", "Habibian-5"));
        students.add(new Student("Ali-6", "Habibian-6"));
        students.add(new Student("Ali-7", "Habibian-7"));

        return students; // Returns Array of JSON objects to the client
    }
}
