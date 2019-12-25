package com.mindtree.igmanagementsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	private String accountName;
	private double revenue;

	// private Ig ig=new Ig();
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "accountId")
	private List<Project> projects = new ArrayList<Project>();

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountId, String accountName, double revenue, List<Project> projects) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.revenue = revenue;
		// this.ig = ig;
		this.projects = projects;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	/*
	 * public Ig getIg() { return ig; } public void setIg(Ig ig) { this.ig = ig; }
	 */
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
