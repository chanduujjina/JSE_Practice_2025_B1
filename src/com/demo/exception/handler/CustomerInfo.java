package com.demo.exception.handler;

public class CustomerInfo {
	
	@Override
	public String toString() {
		return "CustomerInfo [custId=" + custId + ", custName=" + custName + ", phoneNumber=" + phoneNumber
				+ ", panNumber=" + panNumber + ", aadharNumber=" + aadharNumber + "]";
	}

	public CustomerInfo(String custId, String custName, String phoneNumber, String panNumber, String aadharNumber) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phoneNumber = phoneNumber;
		this.panNumber = panNumber;
		this.aadharNumber = aadharNumber;
	}

	public String getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	private String custId;//Number
	
	private String custName;//string
	
	private String phoneNumber ;// indian phoneNumber format
	
	private String panNumber;//valid format of PAN
	
	private String aadharNumber;//valid aadharNumber
	
	
	
	

}
