package com.kpilszak.ecommercedashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.kpilszak.ecommercedashboard.repositories")
@EntityScan("com.kpilszak.ecommercedashboard.entity")
public class EcommerceDashboardApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceDashboardApplication.class, args);
	}
	
}
