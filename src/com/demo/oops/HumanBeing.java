package com.demo.oops;

public class HumanBeing {
	
	private Heart heart;
	
	public HumanBeing(String type) {
		heart = new Heart(type);
	}
	
	public Heart getHeart() {
		return this.heart;
	}

}
