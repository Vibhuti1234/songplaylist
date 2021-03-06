package com.mindtree.igmanagementsystem.entity;

import java.util.ArrayList;
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
public class Ig {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int igId;
	@Column(unique = true)
	private String igName;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "igId")
	private List<Account> accounts ;

	public Ig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ig(int igId, String igName, List<Account> accounts) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.accounts = accounts;
	}

	public int getIgId() {
		return igId;
	}

	public void setIgId(int igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
