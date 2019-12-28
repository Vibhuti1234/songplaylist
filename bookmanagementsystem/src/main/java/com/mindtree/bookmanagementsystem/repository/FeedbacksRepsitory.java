package com.mindtree.bookmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bookmanagementsystem.entity.Feedbacks;
@Repository
public interface FeedbacksRepsitory extends JpaRepository<Feedbacks, Integer>{

}
