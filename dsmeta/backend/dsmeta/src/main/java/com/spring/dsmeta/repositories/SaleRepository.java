package com.spring.dsmeta.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.dsmeta.entities.Sales;

public interface SaleRepository extends JpaRepository<Sales, Long> {
}
