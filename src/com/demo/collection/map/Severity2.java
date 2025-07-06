package com.demo.collection.map;

public enum Severity2 {
	
	LOW(3,"Lower Prioriry"),//Contrctor call
	MEDIUM(2,"Medium Priority"),
	HIGH(1,"High Priority");
	
	private final int val ;
	
	private final String descrption ;
	
	Severity2(int val,String descrption){//Constrctor
		this.val = val;
		this.descrption = descrption;
	}
	
	public String getDescrption() {
		return descrption;
	}

	public int getVal() {
		return val;
	}

}
