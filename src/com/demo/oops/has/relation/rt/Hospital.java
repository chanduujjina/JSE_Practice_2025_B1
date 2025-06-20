package com.demo.oops.has.relation.rt;

public class Hospital {
	

	private String name;
	
	CustomArray2 customArray2 = new CustomArray2();
	
	
	public Hospital(String name) {
		super();
		this.name = name;
	}
	
	public void addDepartment(Department deppartment) {
		customArray2.add(deppartment);
	}
	
	public Department[] listDepartments(){
		return customArray2.getArrayData();
	}
	
	@Override
	public String toString() {
		return "Hospital [name=" + name + ", customArray2=" + customArray2 + "]";
	}

}
