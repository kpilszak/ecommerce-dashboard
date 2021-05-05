package com.kpilszak.ecommercedashboard.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	
	private String name;
	private int chapterCount;
}