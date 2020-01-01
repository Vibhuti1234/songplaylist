package com.mindtree.hotelmanagementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hotelmanagementapp.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
