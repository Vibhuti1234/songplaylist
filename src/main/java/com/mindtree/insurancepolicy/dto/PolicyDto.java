package com.mindtree.insurancepolicy.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.insurancepolicy.entiy.Customer;
import com.mindtree.insurancepolicy.entiy.Transaction;

public class PolicyDto {
	
	private int policyId;
	private String policyName;
	private long maturityTerm;
	
	private TransactionDto transaction;
	public PolicyDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolicyDto(int policyId, String policyName, long maturityTerm,
			TransactionDto transaction) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.maturityTerm = maturityTerm;
		
		this.transaction = transaction;
	}
	
	@Override
	public String toString() {
		return "PolicyDto [policyId=" + policyId + ", policyName=" + policyName + ", maturityTerm=" + maturityTerm
				+ ", transaction=" + transaction + "]";
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public long getMaturityTerm() {
		return maturityTerm;
	}
	public void setMaturityTerm(long maturityTerm) {
		this.maturityTerm = maturityTerm;
	}

	public TransactionDto getTransaction() {
		return transaction;
	}
	public void setTransaction(TransactionDto transaction) {
		this.transaction = transaction;
	}
	
	

}
