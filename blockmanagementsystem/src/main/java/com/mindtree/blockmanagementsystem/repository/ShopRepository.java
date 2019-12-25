package com.mindtree.blockmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.blockmanagementsystem.entity.Shop;
@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer>{

}
