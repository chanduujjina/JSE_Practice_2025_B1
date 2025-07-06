package com.demo.sabitha.io.stream;

import java.io.Serializable;

public class AtmObject implements Serializable{
	
	private static final long serialVersionUID = -6222104380738552029L;
	private int Pin;
	private String AccountNUmber;
	private transient String  password ;
	private transient String  OTP;
	private double balance;
	@Override
	public String toString() {
		return "AtmObject [Pin=" + Pin + ", AccountNUmber=" + AccountNUmber + ", password=" + password + ", OTP=" + OTP
				+ ", balance=" + balance + "]";
	}
	public AtmObject(int pin, String accountNUmber, String password, String oTP, double balance) {
		super();
		Pin = pin;
		AccountNUmber = accountNUmber;
		this.password = password;
		OTP = oTP;
		this.balance = balance;
	}
	
	

}
