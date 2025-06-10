package com.demo.oops.objectinfo.client;

import com.demo.oops.objectinfo.Specimen;

public class DeepCloneDemo1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Specimen specimen1 = new Specimen(1, "Live Stem cell");
		
		Specimen specimen2 = (Specimen)specimen1.clone();
		
        System.out.println("specimen specimen1 data: "+specimen1);
		
		System.out.println("after cloning specimen specimen2 data: "+specimen2);
		
		System.out.println("hashCode  for specimen 1 ::"+specimen1.hashCode());
		
		System.out.println("hashCode address for specimen 2 ::"+specimen2.hashCode());
		
		System.out.println("-----after mutation ------------");
		
		specimen2.setSampleName("liver cell");
		
		System.out.println("after mutating with specimen2 reference  specimen1 data:"+specimen1);
		
		System.out.println("after mutating with specimen2 reference  specimen2 data:"+specimen2);
		
	}

}
