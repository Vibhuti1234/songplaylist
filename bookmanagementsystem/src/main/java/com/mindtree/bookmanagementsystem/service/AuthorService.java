package com.mindtree.bookmanagementsystem.service;

import com.mindtree.bookmanagementsystem.dto.AuthorDto;
import com.mindtree.bookmanagementsystem.entity.Author;
import com.mindtree.bookmanagementsystem.exception.BookManagementApplicationException;

public interface AuthorService {

	String addAuthor(Author author);

	String addBookToAuthor(int authorId, int bookId) throws BookManagementApplicationException;

	AuthorDto getAuthorByBookName(String bookName) throws BookManagementApplicationException;

}
