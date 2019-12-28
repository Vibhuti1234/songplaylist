package com.mindtree.bookmanagementsystem.dto;

public class BookDto implements Comparable<BookDto> {
	private int bookId;
	private String bookName;
	private double avgRating;
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDto(int bookId, String bookName, double avgRating) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.avgRating = avgRating;
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
	public double getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	@Override
	public int compareTo(BookDto e) {
		// TODO Auto-generated method stub
		return (int) (this.avgRating-e.avgRating);
	}
	
}
