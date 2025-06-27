package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArrayListDemo5 {
	public static void main(String[] args) {
      List<Integer>list=AddtheElements(100);
     // List<String>list1=new ArrayList<>();
      List<Integer>list2=AddtheElements(200);
      
    
    
     RetainMethod(list,list2);
}




	private static void RetainMethod(List<Integer> list, List<Integer> list2) {
			System.out.println(list2.retainAll(list));
			System.out.println(list);
			System.out.println(list2);
	}



	private static List<Integer> AddtheElements(int element) {
		List<Integer> list2=new ArrayList<>();
		
		for(int i =1;i<=element;i++) {
			list2.add(i);
		}
		return list2;
	
	
	}
}		