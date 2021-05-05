package com.kpilszak.ecommercedashboard.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestEndpoints {
	
	@Value("${default.course.name}")
	private String cName;
	
	@Value("${default.course.chapterCount}")
	private int chapterCount;
	
	@GetMapping("/defaultCourse")
	public Course getDefaultCourse() {
		return new Course(cName, chapterCount);
	}
	
	@GetMapping("/course")
	public Course getCourse(
			@RequestParam(defaultValue = "Spring Boot") String name,
			@RequestParam(defaultValue = "2") int chapterCount
	) {
		return new Course(name, chapterCount);
	}
	
	@PostMapping("/register/course")
	public String saveCourse(@RequestBody Course course) {
		return "Your course named " + course.getName() + " with " + course.getChapterCount() + " chapters saved " +
				       "successfully.";
	}
}
