package com.mindtree.jpacafechainmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.jpacafechainmanagement.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {

}
