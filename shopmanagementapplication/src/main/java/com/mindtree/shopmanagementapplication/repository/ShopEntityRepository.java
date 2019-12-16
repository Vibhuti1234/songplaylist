package com.mindtree.shopmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.shopmanagementapplication.entity.ShopEntity;
@Repository
public interface ShopEntityRepository extends JpaRepository<ShopEntity, Integer>{

}
