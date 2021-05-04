package com.kpilszak.ecommercedashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoints {
	
	@GetMapping("/course")
	public Course getCourse(
			@RequestParam(defaultValue = "Spring Boot") String name,
			@RequestParam(defaultValue = "2") int chapterCount
	) {
		return new Course(name, chapterCount);
	}
}
