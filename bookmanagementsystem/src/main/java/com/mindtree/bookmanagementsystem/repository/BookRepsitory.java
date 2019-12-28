package com.mindtree.bookmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bookmanagementsystem.entity.Book;
@Repository
public interface BookRepsitory  extends JpaRepository<Book, Integer>{

}
