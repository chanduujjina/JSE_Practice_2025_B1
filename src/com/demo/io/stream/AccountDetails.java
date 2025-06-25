package com.demo.io.stream;

import java.io.Serializable;

public class AccountDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4127258004003961424L;

	private int id;
	
	private String name;
	
	private String accountNumber;
	
	private String phoneNumber;
	
	private String panNumber;
	
	private String gender;
	
	private transient String passWord;
	
	private  transient String passCode;

	@Override
	public String toString() {
		return "AccountDetails [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", phoneNumber="
				+ phoneNumber + ", panNumber=" + panNumber + ", gender=" + gender + ", passWord=" + passWord
				+ ", passCode=" + passCode + "]";
	}

	public AccountDetails(int id, String name, String accountNumber, String phoneNumber, String panNumber,
			String gender, String passWord, String passCode) {
		super();
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.panNumber = panNumber;
		this.gender = gender;
		this.passWord = passWord;
		this.passCode = passCode;
	}

}
