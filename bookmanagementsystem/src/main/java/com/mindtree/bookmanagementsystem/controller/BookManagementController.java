package com.mindtree.bookmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.bookmanagementsystem.dto.AuthorDto;
import com.mindtree.bookmanagementsystem.dto.BookDto;
import com.mindtree.bookmanagementsystem.entity.Author;
import com.mindtree.bookmanagementsystem.entity.Book;
import com.mindtree.bookmanagementsystem.exception.BookManagementApplicationException;
import com.mindtree.bookmanagementsystem.service.AuthorService;
import com.mindtree.bookmanagementsystem.service.BookService;
import com.mindtree.bookmanagementsystem.service.FeedbacksService;

@RestController
public class BookManagementController {
	@Autowired
	BookService bookService;
	@Autowired
	AuthorService authorService;
	@Autowired
	FeedbacksService feedbacksService;
	
	@PostMapping("/addAuthor")
	public String addAuthor(@RequestBody Author author)
	{
		return authorService.addAuthor(author);
	}
	@PostMapping("/insertBook")
	public String insertBook(@RequestBody Book book)
	{
		return bookService.addBook(book);
	}
	@PostMapping("/addBookToAuthor/{authorId}/{bookId}")
	public String addBookToAuthor(@PathVariable int authorId,@PathVariable int bookId) throws BookManagementApplicationException
	{
		return authorService.addBookToAuthor(authorId,bookId);
	}
   @GetMapping("/getAuthorByBookName/{bookName}")
   public AuthorDto getAuthorByBookName(@PathVariable String bookName) throws BookManagementApplicationException
   {
	   return authorService.getAuthorByBookName(bookName);
   }
   @GetMapping("/getBooksInSortedOrder")
   public List<BookDto> getBooksInSortedOrder()
   {
	   return bookService.getBooksInSortedOrder();
   }
}
