package com.demo.sabitha.collections;
import java.util.*;

public class ListArrayListDemo4 {
	public static void main(String[] args) {
		List<Integer> list=AddTheElements(100);
		//List<String> list1=new ArrayList<>();
		List<Integer> list2= AddTheElements(200);
		RetainAllMethods(list,list2);
	}
	
	private static void RetainAllMethods(List<Integer> list, List<Integer> list2) {
		System.out.println(list2.retainAll(list));
		System.out.println(list);
		System.out.println(list2);
		
	}

	private static List<Integer> AddTheElements(Integer list){
		List<Integer> list2=new ArrayList<>();
		for(int i=1;i<=list;i++) {
			list2.add(i);
		}
		return list2;
	}
	
		
}
	