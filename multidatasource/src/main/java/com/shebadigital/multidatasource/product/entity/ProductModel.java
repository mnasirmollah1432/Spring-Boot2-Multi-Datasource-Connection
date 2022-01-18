package com.shebadigital.multidatasource.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductModel {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 @Column(nullable = false)
 private String code;
 private String name;
 private double price;


 protected ProductModel() {}

 public ProductModel(String code, String name, double price) {
  this.code = code;
  this.name = name;                                                               
  this.price = price;
 }

 @Override
 public String toString() {
  return String.format(
   "Product[id=%d, code='%s', name='%s', price='%s']",
   id, code, name, price);
 }

 public int getId() {
  return id;
 }

 public String getCode() {
  return code;
 }

 public String getName() {
  return name;
 }

 public double getPrice() {
  return price;
 }
}