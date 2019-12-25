package com.mindtree.insurancepolicy.dto;

public class PolicyDetailsDto {
	private int customerId;
	private String customerName;
	private int totalAmountInvested;
	private int totalAmountCalculated;
	private int incomeTaxDeduction;
	private int totalAmountReturn;
	public PolicyDetailsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyDetailsDto(int customerId, String customerName, int totalAmountInvested, int totalAmountCalculated,
			int incomeTaxDeduction, int totalAmountReturn) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.totalAmountInvested = totalAmountInvested;
		this.totalAmountCalculated = totalAmountCalculated;
		this.incomeTaxDeduction = incomeTaxDeduction;
		this.totalAmountReturn = totalAmountReturn;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getTotalAmountInvested() {
		return totalAmountInvested;
	}
	public void setTotalAmountInvested(int totalAmountInvested) {
		this.totalAmountInvested = totalAmountInvested;
	}
	public int getTotalAmountCalculated() {
		return totalAmountCalculated;
	}
	public void setTotalAmountCalculated(int totalAmountCalculated) {
		this.totalAmountCalculated = totalAmountCalculated;
	}
	public int getIncomeTaxDeduction() {
		return incomeTaxDeduction;
	}
	public void setIncomeTaxDeduction(int incomeTaxDeduction) {
		this.incomeTaxDeduction = incomeTaxDeduction;
	}
	public int getTotalAmountReturn() {
		return totalAmountReturn;
	}
	public void setTotalAmountReturn(int totalAmountReturn) {
		this.totalAmountReturn = totalAmountReturn;
	}
	@Override
	public String toString() {
		return "PolicyDetailsDto [customerId=" + customerId + ", customerName=" + customerName
				+ ", totalAmountInvested=" + totalAmountInvested + ", totalAmountCalculated=" + totalAmountCalculated
				+ ", incomeTaxDeduction=" + incomeTaxDeduction + ", totalAmountReturn=" + totalAmountReturn + "]";
	}


}
