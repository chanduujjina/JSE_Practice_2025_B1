package com.demo.oops;

public class Heart {
	
	@Override
	public String toString() {
		return "Heart [type=" + type + "]";
	}

	private String type;
	
	public Heart(String type) {
		this.type = type;
	}

}
