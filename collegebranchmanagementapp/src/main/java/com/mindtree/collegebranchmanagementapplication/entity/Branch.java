package com.mindtree.collegebranchmanagementapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int branchId;
	private String branchName;
	private int branchStrength;
	private String hodName;
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(int branchId, String branchName, int branchStrength, String hodName) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchStrength = branchStrength;
		this.hodName = hodName;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public int getBranchStrength() {
		return branchStrength;
	}
	public void setBranchStrength(int branchStrength) {
		this.branchStrength = branchStrength;
	}
	public String getHodName() {
		return hodName;
	}
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	
}
