package com.danilo.courses;

import com.danilo.courses.entities.Course;
import com.danilo.courses.repositories.CourseRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApplication.class, args);
	}

	@Bean
	CommandLineRunner initDB(CourseRepository courseRepository){
		return args -> {
			Course course = new Course();
			course.setName("Curso Angular");
			course.setCategory("Front-end");
			courseRepository.deleteAll();
			courseRepository.save(course);
		};
	}

}