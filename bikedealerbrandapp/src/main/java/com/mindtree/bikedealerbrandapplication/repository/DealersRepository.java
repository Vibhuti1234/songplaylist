package com.mindtree.bikedealerbrandapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bikedealerbrandapplication.entity.Dealers;

@Repository
public interface DealersRepository extends JpaRepository<Dealers, Integer>{

}
