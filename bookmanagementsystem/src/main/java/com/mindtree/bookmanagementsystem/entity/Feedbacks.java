package com.mindtree.bookmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedbacks {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int feedbackId;
private String comments;
private double rating;
public Feedbacks() {
	super();
	// TODO Auto-generated constructor stub
}
public Feedbacks(int feedbackId, String comments, double rating) {
	super();
	this.feedbackId = feedbackId;
	this.comments = comments;
	this.rating = rating;
}
public int getFeedbackId() {
	return feedbackId;
}
public void setFeedbackId(int feedbackId) {
	this.feedbackId = feedbackId;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}

}
