package com.kpilszak.ecommercedashboard.repositories;

import com.kpilszak.ecommercedashboard.entity.EmployeeInformation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "employeeInformationRepository")
public interface EmployeeInformationRepository extends JpaRepository<EmployeeInformation, String> {

}
