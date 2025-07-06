package com.demo.sabitha.objectinfo.growableArray;

import com.demo.oops.objectinfo.Sample;

public class CustomArray1Client {
	public static void main(String args[]) {
		Sample sample1=new Sample(1,"Blood");
		Sample sample2 = new Sample(2, "Urine");
		Sample sample3 = new Sample(3, "Splut");
		Sample sample4 = new Sample(4, "Tissue");
		Sample sample5 = new Sample(5, "Fulid");
		
		CustomArray1 customArray1=new CustomArray1();
		customArray1.addElements(sample1);
		customArray1.addElements(sample2);
		customArray1.addElements(sample3);
		customArray1.addElements(sample4);
		customArray1.addElements(sample5);
		for(Object sample : customArray1.getElement())
		{
			System.out.println(sample);
		}
		
	}
	
	

}
