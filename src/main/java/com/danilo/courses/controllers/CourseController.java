package com.danilo.courses.controllers;

import java.util.List;

import com.danilo.courses.entities.Course;
import com.danilo.courses.repositories.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseRepository repository;

    @GetMapping
    public List<Course> findAll() {
        return repository.findAll();
    }
}