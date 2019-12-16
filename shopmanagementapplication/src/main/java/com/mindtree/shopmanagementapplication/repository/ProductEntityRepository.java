package com.mindtree.shopmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.shopmanagementapplication.entity.ProductEntity;
@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer>{

}
