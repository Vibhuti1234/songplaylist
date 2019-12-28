package com.mindtree.bookmanagementsystem.dto;

public class AuthorDto {
	private String authorName;

	public AuthorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorDto(String authorName) {
		super();
		this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

}
