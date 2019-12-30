package com.mindtree.flipkartshoppingapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.flipkartshoppingapplication.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
