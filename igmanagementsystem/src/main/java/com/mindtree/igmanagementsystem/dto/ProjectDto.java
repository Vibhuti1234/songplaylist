package com.mindtree.igmanagementsystem.dto;

public class ProjectDto {
	private int projectId;
	private String projectName;
	private int resourceCount;
	private double projectCost;

	/*
	 * @JsonIgnore private AccountDto account=new AccountDto();
	 */
	public ProjectDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectDto(int projectId, String projectName, int resourceCount, double projectCost) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.resourceCount = resourceCount;
		this.projectCost = projectCost;
		// this.account = account;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getResourceCount() {
		return resourceCount;
	}

	public void setResourceCount(int resourceCount) {
		this.resourceCount = resourceCount;
	}

	public double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}
	/*
	 * public AccountDto getAccount() { return account; } public void
	 * setAccount(AccountDto account) { this.account = account; }
	 */

}
