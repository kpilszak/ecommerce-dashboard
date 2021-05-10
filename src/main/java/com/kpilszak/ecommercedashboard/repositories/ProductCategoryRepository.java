package com.kpilszak.ecommercedashboard.repositories;

import com.kpilszak.ecommercedashboard.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "productCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {

}
