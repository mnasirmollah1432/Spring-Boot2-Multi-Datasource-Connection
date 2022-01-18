package com.shebadigital.multidatasource.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shebadigital.multidatasource.product.entity.ProductModel;

public interface ProductModelRepository extends JpaRepository<ProductModel, Integer> {

}
