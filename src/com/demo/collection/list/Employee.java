package com.demo.collection.list;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String gender;
	
	private String deptName;
	
	private Double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String gender, String deptName, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.deptName = deptName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", deptName=" + deptName + ", salary="
				+ salary + "]";
	}

}
