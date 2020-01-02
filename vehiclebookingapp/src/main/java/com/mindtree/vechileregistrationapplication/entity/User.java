package com.mindtree.vechileregistrationapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userId;
private String userName;
@JsonManagedReference
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="userId")
private List<Vechile> vechiles;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int userId, String userName, List<Vechile> vechiles) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.vechiles = vechiles;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public List<Vechile> getVechiles() {
	return vechiles;
}
public void setVechiles(List<Vechile> vechiles) {
	this.vechiles = vechiles;
}

}
