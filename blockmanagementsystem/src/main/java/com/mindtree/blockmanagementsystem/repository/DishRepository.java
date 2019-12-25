package com.mindtree.blockmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.blockmanagementsystem.entity.Dishes;
@Repository
public interface DishRepository  extends JpaRepository<Dishes, Integer>{

}
