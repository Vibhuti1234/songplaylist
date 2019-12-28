package com.mindtree.bookmanagementsystem.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookId;
	@Column(unique=true)
	private String bookName;
	private double avgRating;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="bookId")
	private List<Feedbacks> feedbacks;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}

	public Book(int bookId, String bookName, double avgRating, List<Feedbacks> feedbacks) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.avgRating = avgRating;
		this.feedbacks = feedbacks;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public List<Feedbacks> getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(List<Feedbacks> feedbacks) {
		this.feedbacks = feedbacks;
	}

}
