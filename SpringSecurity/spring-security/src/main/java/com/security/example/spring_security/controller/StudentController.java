package com.security.example.spring_security.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.security.example.spring_security.model.Student;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class StudentController {

    List<Student> students =new ArrayList<>(
    Arrays.asList(
        new Student(1, "John Doe", "123 Main St", "john.doe@gmail.com"),
        new Student(2, "Jane Smith", "456 Elm St", "jane.s@gmail.com")));


        @GetMapping("/students")
        public List<Student> getMethodName() {
            return students;
        }

        @PostMapping("/students")
        public Student postMethodName(@RequestBody Student entity) {
            //TODO: process POST request
            
            return entity;
        }
        

        public CsrfToken getCsrfToken(HttpServletRequest token) {
            return (CsrfToken) token.getAttribute("_csrf");
        }
        
    
}
