package com.mindtree.flipkartshoppingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.flipkartshoppingapplication.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
