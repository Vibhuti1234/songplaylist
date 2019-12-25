package com.mindtree.insurancepolicy.entiy;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "POLICY")
public class Policy {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "POLICYID")
	private int policyId;
	@Column( name = "POLICYNAME")
	private String policyName;
	@Column(name = "MATURITYTEARM")
	private long maturityTerm;
	
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(int policyId, String policyName, long maturityTerm) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.maturityTerm = maturityTerm;
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
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", maturityTerm=" + maturityTerm + "]";
	}

	
	

}
