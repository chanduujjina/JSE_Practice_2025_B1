package com.demo.oops.objectinfo.client;

import com.demo.oops.objectinfo.Specimen;

public class ShallCloneDemo1 {
	
	public static void main(String[] args) {
		
		Specimen specimen1 = new Specimen(1, "Live Stem cell");
		
		//clone specimen1 
		
		Specimen specimen2 = specimen1;
		
		System.out.println("before mutating specimen specimen1 data: "+specimen1);
		
		System.out.println("before mutating specimen specimen2 data: "+specimen2);
		
		specimen2.setSampleName("liver cell");
		
		System.out.println("------after mutating ------------------------");
		
    System.out.println("after mutating specimen specimen1 data: "+specimen1);
		
		System.out.println("after mutating specimen specimen2 data: "+specimen2);
	}

}
