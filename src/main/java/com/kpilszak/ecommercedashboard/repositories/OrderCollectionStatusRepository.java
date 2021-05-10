package com.kpilszak.ecommercedashboard.repositories;

import com.kpilszak.ecommercedashboard.entity.OrderCollectionStatus;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "orderCollectionStatusRepository")
public interface OrderCollectionStatusRepository extends JpaRepository<OrderCollectionStatus, String> {

}
