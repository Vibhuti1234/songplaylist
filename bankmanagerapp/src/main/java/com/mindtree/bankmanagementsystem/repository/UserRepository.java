package com.mindtree.bankmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bankmanagementsystem.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
