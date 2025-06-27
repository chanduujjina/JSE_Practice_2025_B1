package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMockData {
	
	private EmployeeMockData() {
		
	}
	
	private static List<Employee> employeeList = new ArrayList<>();
	
	static {
		employeeList.add(new Employee(1, "Chandu", "male", "it", 10000d));
		employeeList.add(new Employee(2, "Hemanth", "male", "it", 20000d));
		employeeList.add(new Employee(3, "Sabitha", "female", "it", 30000d));
		employeeList.add(new Employee(4, "Sekhar", "male", "admin", 40000d));
		employeeList.add(new Employee(5, "Sudhakar", "male", "finance", 20000d));
	}
	
	public static List<Employee> getEmployeeList(){
		
		
		return employeeList;
	}

}
