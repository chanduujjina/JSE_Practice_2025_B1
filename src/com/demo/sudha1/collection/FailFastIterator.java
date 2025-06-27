package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FailFastIterator {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		AddElements(list);
		for(Integer a:list) {
			list.add(a);
		}
	
	}

	private static void AddElements(List<Integer> list) {
		for(int i=0;i<=100;i++) {
			list.add(i);
			
		}
		
		
	}
}		