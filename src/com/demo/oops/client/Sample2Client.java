package com.demo.oops.client;

import com.demo.oops.Sample2;

public class Sample2Client {
	
	public static void main(String[] args) {
		
		Sample2 sample1 = new Sample2();
		System.out.println("object 1:"+sample1.toString());
      
		
         Sample2 sample2 = new Sample2(1, "blood","its blood sample to test hemoglobin percentage");
		
		System.out.println(" object 3:"+sample2.toString());
		
		sample2.m1();
		
		
	}

}
