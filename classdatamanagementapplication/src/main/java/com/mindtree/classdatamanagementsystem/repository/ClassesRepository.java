package com.mindtree.classdatamanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindtree.classdatamanagementsystem.entity.Classes;
@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer>{

}
