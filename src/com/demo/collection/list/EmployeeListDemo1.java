package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeListDemo1 {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = EmployeeMockData.getEmployeeList();
		
		System.out.println(employeeList);
		
		//filter data 
		//it department
		
		List<Employee> itEmployeeList = new ArrayList<>();
		for (Employee employee :employeeList) {
			if (employee.getDeptName().equals("it")) {
				itEmployeeList.add(employee);
			}
		}
		
		System.out.println(itEmployeeList);
		
		
		//sort data
		
		Collections.sort(employeeList, new CustomNameComparator());
		
		System.out.println(employeeList);
	}

}
