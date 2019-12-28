package com.mindtree.bookmanagementsystem.service;

import java.util.List;

import com.mindtree.bookmanagementsystem.dto.BookDto;
import com.mindtree.bookmanagementsystem.entity.Book;

public interface BookService {

	String addBook(Book book);

	List<BookDto> getBooksInSortedOrder();

}
