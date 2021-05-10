package com.kpilszak.ecommercedashboard.repositories;

import com.kpilszak.ecommercedashboard.entity.CompanyRevenue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "companyRevenueRepository")
public interface CompanyRevenueRepository extends JpaRepository<CompanyRevenue, String> {

}
