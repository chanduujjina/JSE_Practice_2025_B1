package com.demo.dp.creational.pattern.prototype;

import com.demo.dp.creational.pattern.prototype.Employee;

public class ProtoTypeDemo1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee employee1 = new Employee();
		
		Employee employee2 = (Employee)employee1.clone();
		
		System.out.println("hashcode of "+employee1.hashCode());
		
		System.out.println("hashcode of "+employee2.hashCode());
		
		//For each request that should create new Object
	}

}
