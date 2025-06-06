package com.demo.oops;

public class Dervied2 extends Base1{
	
	private String childType;

	public Dervied2(String type,String childType ) {
		super(type);
		this.childType =childType; 
	}
	
	public void m2() {
		System.out.println("inside Dervied2 m2()");
	}

	public String getChildType() {
		return childType;
	}

	public void setChildType(String childType) {
		this.childType = childType;
	}

	@Override
	public String toString() {
		return "Dervied2 [childType=" + childType + "]";
	}
			

}
