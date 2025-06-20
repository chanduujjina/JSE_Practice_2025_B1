package com.demo.oops;

public class Parent {
	
    // public com.demo.oops.Parent();
	
    

	private String type;
	
	private int id;
	
	/*
	 * public Parent() { System.out.println("inside Parent class constrctor"); }
	 */
	
	public Parent(String type, int id) {
		super();
		this.type = type;
		this.id = id;
	}
	
	public String getType() {
		return type;
	}

	

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Parent [type=" + type + ", id=" + id + "]";
	}

}
