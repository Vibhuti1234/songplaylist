package com.mindtree.vechileregistrationapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vechile {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int vechileId;
private String vechileName;
private String vechileState;
private String vechileCountry;
private String vechileCode;
public Vechile() {
	super();
	// TODO Auto-generated constructor stub
}
public Vechile(int vechileId, String vechileName, String vechileState, String vechileCountry, String vechileCode) {
	super();
	this.vechileId = vechileId;
	this.vechileName = vechileName;
	this.vechileState = vechileState;
	this.vechileCountry = vechileCountry;
	this.vechileCode = vechileCode;
}
public int getVechileId() {
	return vechileId;
}
public void setVechileId(int vechileId) {
	this.vechileId = vechileId;
}
public String getVechileName() {
	return vechileName;
}
public void setVechileName(String vechileName) {
	this.vechileName = vechileName;
}
public String getVechileState() {
	return vechileState;
}
public void setVechileState(String vechileState) {
	this.vechileState = vechileState;
}
public String getVechileCountry() {
	return vechileCountry;
}
public void setVechileCountry(String vechileCountry) {
	this.vechileCountry = vechileCountry;
}
public String getVechileCode() {
	return vechileCode;
}
public void setVechileCode(String vechileCode) {
	this.vechileCode = vechileCode;
}

}
