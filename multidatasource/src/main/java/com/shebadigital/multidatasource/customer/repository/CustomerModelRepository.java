package com.shebadigital.multidatasource.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shebadigital.multidatasource.customer.entity.CustomerModel;

public interface CustomerModelRepository extends JpaRepository<CustomerModel, Integer> {

}
