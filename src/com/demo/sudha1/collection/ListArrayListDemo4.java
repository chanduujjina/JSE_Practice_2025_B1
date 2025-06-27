package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArrayListDemo4 {
	public static void main(String[] args) {
      List<Integer>list=new ArrayList<>();
      List<String>list1=new ArrayList<>();
      List<Integer>list2=new ArrayList<>();
      
    
      AddtheElements(list,list1);
      RemoveMethod(list,list1,list2);
      
}

	private static void RemoveMethod(List<Integer> list, List<String> list1, List<Integer> list2) {
	System.out.println(list.remove(66));
	System.out.println(list1.remove("1"));
	System.out.println(list.removeAll(list));
	}

	private static void AddtheElements(List<Integer> list, List<String> list1) {
		for(int i=1;i<=100;i++) {
			list.add(i);
			list1.add(String.valueOf(i));
		}
		list1.add("1");
	}
}		