package com.demo.assignment.sudha;

import java.util.HashMap;
import java.util.Map;

public class FrequencySample {
	public static void main(String[] args) {
		String name="JavaProgramming";
		
		for(int i=0;i<name.length();i++) {
			int factorcount=0;
			for(int j=0;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					factorcount++;
					
				}
			}
			System.out.println(name.charAt(i)+"-> "+factorcount);
		}
	
	
	
	}

}
