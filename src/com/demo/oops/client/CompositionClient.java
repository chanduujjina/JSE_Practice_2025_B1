package com.demo.oops.client;

import com.demo.oops.HumanBeing;

public class CompositionClient {
	
	public static void main(String[] args) {
		
		HumanBeing humanBeing = new HumanBeing("Warm hearted");
		
		System.out.println(humanBeing.getHeart().toString());
		
		//humanBeing = null;//unrefrencing your object
		
		//System.out.println(humanBeing.getHeart().toString());
	}

}
