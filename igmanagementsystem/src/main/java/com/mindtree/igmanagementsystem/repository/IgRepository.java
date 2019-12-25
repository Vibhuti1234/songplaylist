package com.mindtree.igmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.igmanagementsystem.entity.Ig;
@Repository
public interface IgRepository extends JpaRepository<Ig, Integer> {

}
