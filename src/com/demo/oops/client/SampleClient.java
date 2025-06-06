package com.demo.oops.client;

import com.demo.oops.Sample;

public class SampleClient {
	
	public static void main(String[] args) {
		
		Sample sample1 = new Sample();
		
		System.out.println(" object 1:"+sample1.toString());
		
		Sample sample2 = new Sample(1, "blood");
		
		System.out.println(" object 2:"+sample2.toString());
		
         Sample sample3 = new Sample(1, "blood","its blood sample to test hemoglobin percentage");
		
		System.out.println(" object 3:"+sample3.toString());
	}

}
