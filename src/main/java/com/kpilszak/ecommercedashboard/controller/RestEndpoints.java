package com.kpilszak.ecommercedashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class RestEndpoints {
	
	@Value("${default.course.name}")
	private String cName;
	
	@Value("${default.course.chapterCount}")
	private int chapterCount;
	
	@Autowired
	private CourseConfiguration configuration;
	
	@GetMapping("/defaultCourse")
	public Course getDefaultCourse() {
		return new Course(cName, chapterCount);
	}
	
	@GetMapping("/getHierarchical")
	public HashMap<String, Object> getConfigAnnotateProperties() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", configuration.getName());
		map.put("chapterCount", configuration.getChapterCount());
		map.put("rating", configuration.getRating());
		map.put("author", configuration.getAuthor());
		
		return map;
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
