package com.mindtree.blockmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.mindtree.blockmanagementsystem.entity.Block;
@Service
public interface BlockRepository extends JpaRepository<Block, Integer>{

}
