package com.mindtree.bookmanagementsystem.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bookmanagementsystem.dto.BookDto;
import com.mindtree.bookmanagementsystem.entity.Book;
import com.mindtree.bookmanagementsystem.entity.Feedbacks;
import com.mindtree.bookmanagementsystem.repository.AuthorRepsitory;
import com.mindtree.bookmanagementsystem.repository.BookRepsitory;
import com.mindtree.bookmanagementsystem.repository.FeedbacksRepsitory;
import com.mindtree.bookmanagementsystem.service.BookService;
@Service
public class BookServiceImpl implements BookService{
	static double avgRating=0;

	@Autowired
	FeedbacksRepsitory  feedbacksRepsitory;
	@Autowired
	BookRepsitory bookRepsitory;
	@Autowired
	AuthorRepsitory authorRepsitory;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub\
		List<Feedbacks> feedbacks=book.getFeedbacks();
		feedbacks.stream().forEach(i->{avgRating=avgRating+i.getRating();});
		avgRating=avgRating/feedbacks.size();
		book.setAvgRating(avgRating);
		bookRepsitory.save(book);
		return "success";
	}
	@Override
	public List<BookDto> getBooksInSortedOrder() {
		// TODO Auto-generated method stub
		List<BookDto> bookDtos=bookRepsitory.findAll().stream().map(i->convertEntityToDto(i)).collect(Collectors.toList());
		Collections.sort(bookDtos, Collections.reverseOrder());
		return bookDtos;
	}
	private BookDto convertEntityToDto(Book i) {
		// TODO Auto-generated method stub
		return modelMapper.map(i, BookDto.class);
	}
}
