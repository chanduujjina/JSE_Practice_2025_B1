package com.demo.oops.objectinfo.client;

import com.demo.oops.objectinfo.Sample;
import com.demo.oops.objectinfo.SampleInfo;

public class SampleClient2 {
	
	public static void main(String[] args) {
		
		//Object creation
		Sample sample1 = new Sample(1, "Blood");// hashcode :1342443276
		
		System.out.println("sample object1 reference address: "+sample1);//50040f0c
		
		
		Sample sample2 = new Sample(2, "Urine");//hascode 1225358173
		
		System.out.println("sample object2 reference address: "+sample2);//49097b5d
		
       Sample sample3 = new Sample(2, "Urinee");//hascode 1848402763
		
		System.out.println("sample object2 reference address: "+sample3);//6e2c634b
		
		System.out.println("sample 1 hashCode "+sample1.hashCode()+ " sample 2 hashCode "+sample2.hashCode()+" sample 3 hashCode "+sample3.hashCode());
		
		
		System.out.println("compare object1 and Object 2:"+sample1.equals(sample2));
		//How to find duplicate objects
		
		System.out.println("compare object2 and Object 3:"+sample2.equals(sample3));
		
		Sample sample4 = new Sample(4, "Hemo");
		
		Sample sample5 = sample4;
		
		System.out.println("compare object 4 and Object 5:"+sample4.equals(sample5));
		
		//just verify other casses
		
		SampleInfo sampleInfo1 = new SampleInfo(1, "Blood");
		
		
		System.out.println("compare SampleInfo object 1 and Sample Object 1:"+sample1.equals(sampleInfo1));
		
		System.out.println("compare SampleInfo object 1 and Sample Object 1:"+sample1.equals(null));
		
		
	}

}
