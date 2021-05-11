package com.kpilszak.ecommercedashboard.service;

import com.kpilszak.ecommercedashboard.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DasboardService {
	
	List<CompanyRevenue> getTodayRevenueDash();
	
	List<EmployeeInformation> getAllEmployee();
	
	EmployeeInformation getEmployee(final String pk);
	
	List<OrderCollectionStatus> getOrderCollection();
	
	List<OrderReceived> getAllOrderReceived();
	
	List<ProductCategory> getBestCategory();
	
	EmployeeInformation addEmployee(EmployeeInformation employeeInformation);
	
	EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);
	
	void deleteEmployee(EmployeeInformation employeeInformation);
}
