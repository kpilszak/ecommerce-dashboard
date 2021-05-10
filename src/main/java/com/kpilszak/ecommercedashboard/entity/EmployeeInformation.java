package com.kpilszak.ecommercedashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "employee_information")
public class EmployeeInformation extends KeyEntity {
	private String name;
	private String position;
	private String officeLocation;
	private int age;
	private Date startDate;
	private double salary;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getOfficeLocation() {
		return officeLocation;
	}
	
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
