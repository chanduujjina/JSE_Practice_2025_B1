package com.demo.oops.objectinfo.client;

import com.demo.oops.objectinfo.Sample;

public class SampleClient {
	
	public static void main(String[] args) {
		
		//Object creation
		Sample sample1 = new Sample(1, "Blood");
		
		System.out.println("sample object1 reference address: "+sample1);//50040f0c
		
		
		Sample sample2 = new Sample(2, "Urine");
		
		System.out.println("sample object2 reference address: "+sample1);//2dda6444
		
		int hashCodeForSample1 = sample1.hashCode();
		
		System.out.println("sample1 hashCode:"+hashCodeForSample1);
		
		
      int hashCodeForSample2 = sample2.hashCode();
		
		System.out.println("sample2 hashCode:"+hashCodeForSample2);
		
		
		boolean equals = sample1.equals(sample2);
		
		System.out.println("compare two objects result:"+equals);
		
		
		//usage of get class
		Class<? extends Sample> class1 = sample2.getClass();
		
		System.out.println(class1);
		
		
		Sample sample3 = new Sample(3, "Hemoglobin");//1f17ae12
		
		System.out.println(sample3);
		
		Sample sample4 = sample3;//1f17ae12
		System.out.println(sample4);
		
		System.out.println("Hashcode for object 3:"+sample3.hashCode());
		
		System.out.println("Hashc0de for object 4:"+sample4.hashCode());
		
		boolean equals2 = sample3.equals(sample4);
		
		System.out.println("compare object3 and Object4 :"+equals2);
	}

}
