package com.mindtree.vechileregistrationapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.vechileregistrationapplication.entity.Vechile;
@Repository
public interface VechileRepository extends JpaRepository<Vechile, Integer>{

}
