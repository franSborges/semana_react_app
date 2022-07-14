package com.spring.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dsmeta.entities.Sales;
import com.spring.dsmeta.repositories.SaleRepository;

@Service
public class SalesService {
  
  @Autowired
  private SaleRepository repository;

  public List<Sales> findSales() {
   return repository.findAll();

  }
}
