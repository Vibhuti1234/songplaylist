package com.mindtree.igmanagementsystem.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AccountDto implements Comparable<AccountDto> {
	private int accountId;
	private String accountName;
	private double revenue;
	/*
	 * @JsonIgnore private IgDto ig=new IgDto();
	 */
	@JsonIgnore
	private List<ProjectDto> projects;

	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountDto(int accountId, String accountName, double revenue, List<ProjectDto> projects) {
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
	 * public IgDto getIg() { return ig; } public void setIg(IgDto ig) { this.ig =
	 * ig; }
	 */
	public List<ProjectDto> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectDto> projects) {
		this.projects = projects;
	}

	@Override
	public int compareTo(AccountDto e) {
		// TODO Auto-generated method stub
		return (int) (this.revenue - e.revenue);
	}

}
