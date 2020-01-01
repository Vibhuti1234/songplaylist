package com.mindtree.hotelmanagementapp.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="phoneNumber")
	private long phoneNumber;
	@Column(name="userName")
	private String userName;
	@Column(name="checkInDate")
	private String checkInDate;
	@Column(name="checkOutDate")
	private String checkOutDate;
	@Column(name ="roomType")
	private String roomType;
	@Column(name="hobbies")
	private String hobbies;
	@Column(name="gender")
	private String gender; 
	@Length(max = 1337)  
	@Column(name = "comment")
	private String comment;
	@Column(name="userEmail",unique=true)
	private String userEmail;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long phoneNumber, String userName, String checkInDate,
			String checkOutDate, String roomType, String hobbies,
			String gender, String comment, String userEmail) {
		super();
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomType = roomType;
		this.hobbies = hobbies;
		this.gender = gender;
		this.comment = comment;
		this.userEmail = userEmail;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
    


}

