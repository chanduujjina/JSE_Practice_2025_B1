/*Assigment for today:
Create an Employee class with below state

id ,name,gender,salary,deptName

set the data and get the data using 
a)setter and getter methods
b)using consrtcor

Go throught below topics

Class
Object
Constructor(default, parameterized)
Usage of this keyword
Encapsulation
Usage of this keyword*/

package com.demo.rajasekhar;

public class EmployeeAssignment {
	static class Employee {
		
		private int id;
	    private String name;
	    private String gender;
	    private double salary;
	    private String deptName;
	    
	    public Employee() {
	           
	        }

	        public Employee(int id, String name, String gender, double salary, String deptName) {
	            this.id = id;
	            this.name = name;
	            this.gender = gender;
	            this.salary = salary;
	            this.deptName = deptName;
	        }

	        public void setId(int id) {
	            this.id = id;
	        }

	        public void setName(String name) {
	            this.name = name;
	        }

	        public void setGender(String gender) {
	            this.gender = gender;
	        }

	        public void setSalary(double salary) {
	            this.salary = salary;
	        }

	        public void setDeptName(String deptName) {
	            this.deptName = deptName;
	        }

	        public int getId() {
	            return id;
	        }

	        public String getName() {
	            return name;
	        }

	        public String getGender() {
	            return gender;
	        }

	        public double getSalary() {
	            return salary;
	        }

	        public String getDeptName() {
	            return deptName;
	        }

	        public void displayDetails() {
	            System.out.println("Employee ID      : " + id);
	            System.out.println("Name             : " + name);
	            System.out.println("Gender           : " + gender);
	            System.out.println("Salary           : " + salary);
	            System.out.println("Department Name  : " + deptName);
	        }
	    }

	    public static void main(String[] args) {

	        Employee emp1 = new Employee();
	        emp1.setId(1);
	        emp1.setName("Raja");
	        emp1.setGender("Male");
	        emp1.setSalary(50000);
	        emp1.setDeptName("IT");

	        Employee emp2 = new Employee(2, "Sree", "Female", 60000, "HR");
	        
	        Employee emp3 = new Employee(3, "Sekhar", "Male", 80000, "Manager");

	        System.out.println("----- Employee 1 -----\n");
	        emp1.displayDetails();

	        System.out.println("\n\n----- Employee 2 -----\n");
	        emp2.displayDetails();
	        
	        System.out.println("\n\n----- Employee 3 -----\n");
	        emp3.displayDetails();
	    }
	}
