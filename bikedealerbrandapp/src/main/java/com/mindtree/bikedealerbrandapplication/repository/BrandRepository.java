package com.mindtree.bikedealerbrandapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bikedealerbrandapplication.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
