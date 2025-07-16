package com.demo.assignment2.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListSalary1 {

	public static void main(String[] args) {
		List<Employee1> employee1 = new ArrayList<>();
		employee1.add(new Employee1(1, "ram", 40000d, "male", 1234567890l));
		employee1.add(new Employee1(2, "abhi", 35000d, "male", 1234567891l));
		employee1.add(new Employee1(3, "deepu", 45000d, "female", 1234567892l));
		Collections.sort(employee1 , new Comparator<Employee1>() {

			@Override
			public int compare(Employee1 o1, Employee1 o2) {
				return Double.compare(o1.getSalary(),o2.getSalary());
			
				
				
			}
		});
		
		for(Employee1 emp : employee1) {
			System.out.println(emp);
		}
	}

}
