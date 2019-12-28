package com.mindtree.bookmanagementsystem.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bookmanagementsystem.dto.AuthorDto;
import com.mindtree.bookmanagementsystem.entity.Author;
import com.mindtree.bookmanagementsystem.entity.Book;
import com.mindtree.bookmanagementsystem.exception.BookManagementApplicationException;
import com.mindtree.bookmanagementsystem.exception.NoAuthorFoundException;
import com.mindtree.bookmanagementsystem.exception.NoBookFoundException;
import com.mindtree.bookmanagementsystem.repository.AuthorRepsitory;
import com.mindtree.bookmanagementsystem.repository.BookRepsitory;
import com.mindtree.bookmanagementsystem.repository.FeedbacksRepsitory;
import com.mindtree.bookmanagementsystem.service.AuthorService;
@Service
public class AuthorServiceImpl implements AuthorService{
	@Autowired
	FeedbacksRepsitory  feedbacksRepsitory;
	@Autowired
	BookRepsitory bookRepsitory;
	@Autowired
	AuthorRepsitory authorRepsitory;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepsitory.save(author);
		return "success";
	}
	@Override
	public String addBookToAuthor(int authorId, int bookId) throws BookManagementApplicationException {
		// TODO Auto-generated method stub
		Author author=authorRepsitory.findAll().stream().filter(i->i.getAuthorId()==authorId).findAny().orElseThrow(()->new NoAuthorFoundException("Author Not Found"));
		Book book=bookRepsitory.findAll().stream().filter(i->i.getBookId()==bookId).findAny().orElseThrow(()->new NoBookFoundException("No Book Found"));
		author.getBooks().add(book);
		authorRepsitory.saveAndFlush(author);
		return "success";
	}
	@Override
	public AuthorDto getAuthorByBookName(String bookName) throws BookManagementApplicationException {
		// TODO Auto-generated method stub
		Book book=bookRepsitory.findAll().stream().filter(i->i.getBookName().equals(bookName)).findAny().orElseThrow(()->new NoBookFoundException("Book Not found"));
		Author author1=new Author();
		for (Author  author : authorRepsitory.findAll()) {
			for (Book book1 : author.getBooks()) {
				if(book1.getBookName().equals(book.getBookName()));
				{
					author1=author;
					break;
				}
				
			}
			
		}
		return convertEntityToDto(author1);
		
	}
	private AuthorDto convertEntityToDto(Author author1) {
		// TODO Auto-generated method stub
		return modelMapper.map(author1, AuthorDto.class);
	}
}
