package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList<String> Arraylist=new ArrayList<>();
		List<String>list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		AddtheElements(Arraylist,list,list1);
		HashCodeMethod(Arraylist,list1);
		ContainsMethod(Arraylist);
		 CloneMethod(Arraylist);
		ToArray(Arraylist);
		ToArrayString(Arraylist);
		ToArrayString1(Arraylist);
		getElement(Arraylist);
		addFirstElement(Arraylist);
		addLastElement(Arraylist);
		EqualsMethod(Arraylist,list,list1 );
		SizeMethod(Arraylist,list,list1);
		SetMethod(Arraylist,list,list1);
		IndexOfMethod(Arraylist,list);
		CleanMethod(Arraylist,list,list1);
		IsEmptyMethod(list,Arraylist);
 
	}

	
				
	





	private static void IsEmptyMethod(List<String> list, ArrayList<String> arraylist) {
		System.out.println("Is Empty Method");
		System.out.println(list.isEmpty());
		System.out.println(arraylist.isEmpty());
	}









	private static void CleanMethod(ArrayList<String> arraylist, List<String> list, List<Integer> list1) {
		System.out.println("Clean Method");
		list.clear();
		System.out.println(list);
		list1.clear();
		System.out.println(list1);
	}









	private static void IndexOfMethod(ArrayList<String> arraylist, List<String> list) {
		System.out.println(arraylist.indexOf("Cherry"));
		System.out.println(arraylist.indexOf(24));
		System.out.println(arraylist.lastIndexOf("26"));
		System.out.println(list.indexOf(12));
		
	}









	private static void SetMethod(ArrayList<String> arraylist, List<String> list, List<Integer> list1) {
		System.out.println("Set Method");
		arraylist.set(24, "cherry");
		System.out.println(arraylist);
		list.set(0, "pandu");
		System.out.println(list);
		
	}






         


	private static void SizeMethod(ArrayList<String> arraylist, List<String> list, List<Integer> list1) {
		System.out.println("Size Method");
		System.out.println(arraylist.size());
		System.out.println(list.size());
		System.out.println(list1.size());
	}









	private static void EqualsMethod(ArrayList<String> arraylist, List<String> list, List<Integer> list1) {
		System.out.println("Equal Method ");
		System.out.println(list.equals(arraylist));
		System.out.println(list.equals(list));
		System.out.println(list.equals(list1));
	}









	private static void addLastElement(ArrayList<String> arraylist) {
		System.out.println("addLastElement");
		arraylist.add(String.valueOf(25));
		System.out.println(arraylist);
	}

	private static void addFirstElement(ArrayList<String> arraylist) {
		System.out.println("addFirstElement");
		 arraylist.add(0,String.valueOf(26));
		 System.out.println(arraylist);
				
	}

	private static void getElement(ArrayList<String> arraylist) {
		System.out.println("getElement");
		System.out.println(arraylist.get(86));
		System.out.println(arraylist.get(0));

				
	}

	private static void ToArrayString1(ArrayList<String> arraylist) {
		System.out.println("ToArrayString1");

		String[] list=arraylist.toArray(new String[1]);
		for(String a1:list) {
			System.out.print(a1);
			
		System.out.println();
}
 
			}

	private static void ToArrayString(ArrayList<String> arraylist) {
		System.out.println("ToArrayString");
		String[] list1=arraylist.toArray(String[]::new);
		 for(String a2:list1) {
			 System.out.println(a2+" ");
			 
		 }
				
	}

	private static void ToArray(ArrayList<String> arraylist) {
		System.out.println("ToArray");
		Object[] array=arraylist.toArray();
		 for(Object a3:array) {
			 System.out.print(a3+" ");
		 }
	}

	private static void CloneMethod(ArrayList<String> arraylist) {
		System.out.println("CloneMethod");
		Object copy =arraylist.clone();
		 System.out.print("Deep copy"+copy);
	
		
	}

	

	private static void ContainsMethod(ArrayList<String> arraylist) {
		System.out.println("ContainsMethod");
		System.out.println(arraylist.contains("88"));
		System.out.println(arraylist.containsAll(arraylist));
		System.out.println(arraylist.contains("102"));
		
	}

	private static void HashCodeMethod(ArrayList<String> arraylist, List<Integer> list1) {
		System.out.println("HashCodeMethod");
		System.out.println(arraylist.hashCode());
		System.out.println(list1.hashCode());
	}

	

	private static void AddtheElements(List<String> arraylist, List<String> list, List<Integer> list1) {
		System.out.println("AddtheElements");
		for(int i =1;i<100;i++) {
			arraylist.add(String.valueOf(i));
			list.add(String.valueOf(i));
			list1.add(i);
			
	
		}
	}

	

	
	
	}












