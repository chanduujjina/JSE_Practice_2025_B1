package com.demo.sabitha.collections;
import java.util.*;

public class ListArrayListDemo3 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		List<Integer> list2= new ArrayList<>();
		AddTheElements(list,list1,list2);
		RemoveMethod(list,list1,list2);
	}
	private static void RemoveMethod(List<Integer> list, List<String> list1, List<Integer> list2) {
		System.out.println(list.remove(88));
		System.out.println(list1.remove("1"));
		System.out.println(list2.removeAll(list));
		System.out.println(list2);
	}

	private static void AddTheElements(List<Integer> list, List<String> list1, List<Integer> list2) {
		for(int i=1;i<=100;i++) {
			list.add(i);
			list2.add(i);
			list1.add(String.valueOf(i));
		}
		list1.add("1");
	}
	
		
}
	