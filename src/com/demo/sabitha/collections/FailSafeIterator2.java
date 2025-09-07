package com.demo.sabitha.collections;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator2 {
	public static void main(String[] args) {
		List<Integer> list=new CopyOnWriteArrayList<>();
		AddElements(list);
		for(Integer s:list) {
			list.set(1, 12);
		}
		System.out.println(list);
	}

	private static void AddElements(List<Integer> list) {
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		
	}
	

	
	
		
}
	