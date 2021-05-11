package com.kpilszak.ecommercedashboard.service.impl;

import com.kpilszak.ecommercedashboard.entity.*;
import com.kpilszak.ecommercedashboard.repositories.*;
import com.kpilszak.ecommercedashboard.service.DasboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaschboardServiceImpl implements DasboardService {
	
	@Autowired
	private CompanyRevenueRepository companyRevenueRepository;
	
	@Autowired
	private EmployeeInformationRepository employeeInformationRepository;
	
	@Autowired
	private OrderCollectionStatusRepository orderCollectionStatusRepository;
	
	@Autowired
	private OrderReceivedRepository orderReceivedRepository;
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	@Override
	public List<CompanyRevenue> getTodayRevenueDash() {
		return companyRevenueRepository.findAll();
	}
	
	@Override
	public List<EmployeeInformation> getAllEmployee() {
		return employeeInformationRepository.findAll();
	}
	
	@Override
	public EmployeeInformation getEmployee(String pk) {
		return employeeInformationRepository.findByPk(pk);
	}
	
	@Override
	public List<OrderCollectionStatus> getOrderCollection() {
		return orderCollectionStatusRepository.findAll();
	}
	
	@Override
	public List<OrderReceived> getAllOrderReceived() {
		return orderReceivedRepository.findAll();
	}
	
	@Override
	public List<ProductCategory> getBestCategory() {
		return productCategoryRepository.findAllByBestCategory(true);
	}
	
	@Override
	public EmployeeInformation addEmployee(EmployeeInformation employeeInformation) {
		return employeeInformationRepository.save(employeeInformation);
	}
	
	@Override
	public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
		return employeeInformationRepository.save(employeeInformation);
	}
	
	@Override
	public void deleteEmployee(EmployeeInformation employeeInformation) {
		employeeInformationRepository.delete(employeeInformation);
	}
}
