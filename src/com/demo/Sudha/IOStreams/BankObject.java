package com.demo.Sudha.IOStreams;

public class BankObject {
	private int id;
	private String name ;
	private String AccountNumber;
	private double PhoneNumber;
	private String Location;
	private double Balance;
	
	@Override
	public String toString() {
		return "BankObject [id=" + id + ", name=" + name + ", AccountNumber=" + AccountNumber + ", PhoneNumber="
				+ PhoneNumber + ", Location=" + Location + ", Balance=" + Balance + "]";
	}

	public BankObject(int id, String name, String accountNumber, double phoneNumber, String location, double balance) {
		super();
		this.id = id;
		this.name = name;
		AccountNumber = accountNumber;
		PhoneNumber = phoneNumber;
		Location = location;
		Balance = balance;
	}
	
	

}
