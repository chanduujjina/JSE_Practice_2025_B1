package com.demo.sabitha.collections;
import java.util.*;

public class FailFastIterator {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>() ;
		AddElements(list);
		for(Integer s:list) {
			list.add(s);
		}
	}

	private static void AddElements(List<Integer> list) {
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		
	}
	

	
	
		
}
	