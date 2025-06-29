package com.demo.dp.creational.pattern.prototype;

public class Employee implements Cloneable{
	
	private int id;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

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

	private String name;
	
	@Override
	 public  Object clone() throws CloneNotSupportedException{
		 return super.clone();
	 }

}
