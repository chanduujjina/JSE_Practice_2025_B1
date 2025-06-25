package com.demo.oops;

public class DeepCloneDemo1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee employee = new Employee(1, "chandu");
		
		System.out.println(employee);
		
		Employee employee1 = (Employee)employee.clone();
		
		System.out.println(employee1);
		
	System.out.println("after clone");
	
	employee.setId(2);
	
	System.out.println("obj1 :"+employee);
	
	System.out.println("obj2 :"+employee1);
		
	}

}
