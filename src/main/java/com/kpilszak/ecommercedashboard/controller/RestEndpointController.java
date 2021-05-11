package com.kpilszak.ecommercedashboard.controller;

import com.kpilszak.ecommercedashboard.entity.EmployeeInformation;
import com.kpilszak.ecommercedashboard.service.DasboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestEndpointController {
	
	@Autowired
	private DasboardService dasboardService;
	
	@GetMapping("/employees")
	public List<EmployeeInformation> getAllEmpl() {
		return dasboardService.getAllEmployee();
	}
	
	@PostMapping("/employee/add")
	public String saveEmployeeInfo(@RequestBody EmployeeInformation employeeInformation) {
		if (dasboardService.addEmployee(employeeInformation) != null) {
			return "Employee data saved succesfully";
		} else {
			return "Error";
		}
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/delete")
	public String deleteEmp(@RequestParam(name = "empId") String pk) {
		try {
			dasboardService.deleteEmployee(dasboardService.getEmployee(pk));
			return "deleted";
		} catch (Exception e) {
			return "error";
		}
	}
}
