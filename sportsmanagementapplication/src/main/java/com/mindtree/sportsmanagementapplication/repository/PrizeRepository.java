package com.mindtree.sportsmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.sportsmanagementapplication.entity.Prize;
@Repository
public interface PrizeRepository extends JpaRepository<Prize, Integer> {

}
