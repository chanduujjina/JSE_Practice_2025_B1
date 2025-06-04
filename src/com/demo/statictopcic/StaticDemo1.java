package com.demo.statictopcic;

public class StaticDemo1 {
	
	
	//static varibles will load first
	private static String orgizationName;
	
	private static String trinerName;
	
	private static String address = "test1";
	
	//static block will load after variable load
	static {
		System.out.println("address:"+address);
		orgizationName = "Star technologies";
		trinerName = "Chandrasekhar";
		address = "test";
	}
	
	//after method call using class name
	public static String getOrgizationDeatils() {
		return orgizationName+ " "+trinerName+" "+address;
	}

}
