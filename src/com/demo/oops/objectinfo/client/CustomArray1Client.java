package com.demo.oops.objectinfo.client;

import com.demo.oops.objectinfo.Sample;

public class CustomArray1Client {
	
	public static void main(String[] args) {
		
	    Sample sample1 = new Sample(1, "Blood");
		Sample sample2 = new Sample(2, "Urine");
		Sample sample3 = new Sample(3, "Splut");
		Sample sample4 = new Sample(4, "Tissue");
		Sample sample5 = new Sample(5, "Fulid");
		
		CustomArray1 customArray1 = new CustomArray1();
		customArray1.add(sample1);
		customArray1.add(sample2);
		customArray1.add(sample3);
		customArray1.add(sample4);
		customArray1.add(sample5);
		
		
	  //print the elements
		
		for (Sample sample : customArray1.getArrayData()) {
			System.out.println(sample);
		}
		
		System.out.println("index opearions-------------");
		//get the element by giving index
		Sample indexOfSample = customArray1.findIndexOf(2);
		
		System.out.println(indexOfSample);
	}

}
