package com.demo.oops.has.relation.rt;

public class Department {
	
	public Department(String name) {
		super();
		this.name = name;
	}

	private String name;

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

}
