package com.demo.stringhandler;
public class ValidateCustmerdata{
	public static void main(String args[]) {
		number("902134567");
		number("0123456789");
		Alphabets("AASDFGHJK56789");
		Alphabets("aghhlgkj");
		Alphanumer("AGfhdhhnj45678");
		Email("Dokkusabithaaa06@gmail.com");
		Email("dokkusabitha@gmail.com");
		dateOfBirth("16/05/2001");
		
		
		
	}
	
	static void number(String num) {
		System.out.println("--------------------------Number---------------------");
		boolean result=num.matches("^[6-9][0-9]+$");
		System.out.println(result);
	}
	
	static void Alphabets(String app) {
		System.out.println("--------------------------Alphabets---------------------");
		boolean result=app.matches("^[a-zA-Z]+$");
		System.out.println(result);
	}
	
	static void Alphanumer(String apn) {
		System.out.println("--------------------------Alpnanumer---------------------");
		boolean result=apn.matches("^[a-zA-Z0-9]+$");
		System.out.println(result);
	}
	static void Email(String ema) {
		System.out.println("--------------------------Email---------------------");
		boolean result=ema.matches("^([A-Z]{1})([a-z]{13})([0-9]{2})@([a-z]{5}).([a-z])+$");
		System.out.println(result);
	}
	static void dateOfBirth(String db) {
		System.out.println("--------------------------dateOfBirth---------------------");
		boolean result=db.matches("^(0[1-9]|1[0-9]|2[0-9]|3[0-1])/(0[1-9]|1[0-2])/(19|20)\\d{2}+$");
		System.out.println(result);
	}
	
}

