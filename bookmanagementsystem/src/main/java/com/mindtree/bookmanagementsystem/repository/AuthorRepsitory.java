package com.mindtree.bookmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bookmanagementsystem.entity.Author;
@Repository
public interface AuthorRepsitory extends JpaRepository<Author, Integer> {

}
