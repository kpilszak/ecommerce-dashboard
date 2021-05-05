package com.kpilszak.ecommercedashboard.controller;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("course")
@Data
public class CourseConfiguration {
	
	private String name;
	private int chapterCount;
	private int rating;
	private String author;
}
