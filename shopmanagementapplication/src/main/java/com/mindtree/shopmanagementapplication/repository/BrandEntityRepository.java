package com.mindtree.shopmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.shopmanagementapplication.entity.BrandEntity;
@Repository
public interface BrandEntityRepository extends JpaRepository<BrandEntity, Integer>{

}
