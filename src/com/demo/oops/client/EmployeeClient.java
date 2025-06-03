package com.demo.oops.client;

import com.demo.oops.Employee;

public class EmployeeClient {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setName("sudhakar");
		e1.setGender("male");
		e1.setEmployeeId(1);
		e1.setPhoneNumber(9676010868L);
		
		// with reference
		
		String gender = e1.getGender();
		String name = e1.getName();
		int employeeId = e1.getEmployeeId();
		Long phoneNumber = e1.getPhoneNumber();
		
		System.out.println("gender: "+gender+ " name:"+name+" id:"+employeeId+" phoneNumber:"+phoneNumber);
		
		
		
	Employee e2 = new Employee();
		
		e2.setName("deepthi");
		e2.setGender("female");
		e2.setEmployeeId(2);
		e2.setPhoneNumber(8341053744L);
		
		System.out.println(e2.toString());
		
	}

}
