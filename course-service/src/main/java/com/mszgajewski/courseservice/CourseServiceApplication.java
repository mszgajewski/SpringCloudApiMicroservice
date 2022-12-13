package com.mszgajewski.courseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@SpringBootApplication
public class CourseServiceApplication {

	@GetMapping("/courses")
	public List<Course> getCourses(){
		return Stream.of(
				new Course("CT12","Java", 5, 5000),
				new Course("CT98","Spring Boot", 3, 8000),
				new Course("CT346","AWS", 2, 7000)
				).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

}
