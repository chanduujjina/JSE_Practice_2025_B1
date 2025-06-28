package com.demo.dp.creational.pattern.builder;

public class BuilderDpDemo1 {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer.Builder(1, "chandu").build();
		
		Customer customer2 = new Customer.Builder(2, "sabitha").gender("female").email("sabitha@gmail.com").build();
		
		Customer customer3 = new Customer.Builder(3, "Sudhakar").gender("male").email("sudhakar@gmail.com").phoneNumber("1234567891").build();
		
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
	}

}
