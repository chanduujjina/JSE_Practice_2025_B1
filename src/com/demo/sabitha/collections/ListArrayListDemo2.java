package com.demo.sabitha.collections;
import java.util.*;

public class ListArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> Arraylist=new ArrayList<>();
		List<Integer> list=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		AddTheElements(Arraylist,list,list1);
		HashCodeMethod(Arraylist, list1);
		ContainsMethod(Arraylist,CloneMethod(Arraylist),list,list1);
		System.out.println("clone "+CloneMethod(Arraylist));
		ToArrayMethod(Arraylist);
		ToArrayMethodString(Arraylist);
		ToArrayMethodObject(Arraylist);
		GetElements(Arraylist);
		EqualsMethods(Arraylist,list,list1);
		AddFirst(Arraylist);
		AddLast(Arraylist);
		SizeMethod(Arraylist,list,list1);
		SetMethod(Arraylist,list);
		IndexOfMethod(Arraylist,list);
		cleanMethod(Arraylist,list,list1);
		IsEmptyMethod(list,Arraylist);
	}
	private static void cleanMethod(ArrayList<String> arraylist, List<Integer> list, List<String> list1) {
		System.out.println("clean Method");
		list.clear();
		System.out.println(list);
		list1.clear();
		System.out.println(list1);
		
	}

	private static void IsEmptyMethod(List<Integer> list, ArrayList<String> arraylist) {
		System.out.println("is EmptyMethod ");
		System.out.println(list.isEmpty());
		System.out.println(arraylist.isEmpty());
		
	}

	private static void IndexOfMethod(ArrayList<String> arraylist, List<Integer> list) {
		System.out.println(arraylist.indexOf("sai"));
		System.out.println(arraylist.indexOf("10"));
		System.out.println(arraylist.lastIndexOf("10"));
		System.out.println(list.indexOf(10));
	}

	private static void SetMethod(ArrayList<String> arraylist, List<Integer> list) {
		System.out.println("setMethod");
		arraylist.set(4,"sai");
		System.out.println(arraylist);
		list.set(0,34);
		System.out.println(list);
	}

	private static void SizeMethod(ArrayList<String> arraylist, List<Integer> list, List<String> list1) {
		System.out.println("Size method");
		System.out.println(arraylist.size());
		System.out.println(list.size());
		System.out.println(list1.size());
	}

	private static void EqualsMethods(ArrayList<String> arraylist, List<Integer> list, List<String> list1) {
		System.out.println("Equals method ");
		System.out.println(list.equals(arraylist));
		System.out.println(list.equals(list));
		System.out.println(arraylist.equals(list1));
	}

	private static Object CloneMethod(ArrayList<String> arraylist) {
		Object copy = arraylist.clone();
		return copy;
	}

	

	private static void AddLast(ArrayList<String> arraylist) {
		System.out.println("Addlast");
		arraylist.add(String.valueOf(101));
		System.out.println(arraylist);
		
	}

	private static void AddFirst(ArrayList<String> arraylist) {
		System.out.println("addfirst");
		arraylist.add(0,String.valueOf(10));
		System.out.println(arraylist);
		
	}

	private static void GetElements(ArrayList<String> arraylist) {
		System.out.println("\nGetElements\n"+arraylist.get(67));
		
		
	}

	private static void ToArrayMethodObject(ArrayList<String> arraylist) {
		System.out.println("\nToArrayMethodObject");
		Object[] array = arraylist.toArray();
		for(Object x3:array) {
			System.out.print(x3+" ");
		}
		
	}

	private static void ToArrayMethodString(ArrayList<String> arraylist) {
		System.out.println("\nToArrayMethodString");
		String[] list1 = arraylist.toArray(String[]::new);
		for(String x2:list1) {
			System.out.print(x2+" ");
		}
		
		
	}

	private static void ToArrayMethod(ArrayList<String> arraylist) {
		System.out.println("\nToArrayMethod");
		String[] list=arraylist.toArray(new String[1]);
		for(String x1:list) {
			System.out.print(x1+"  ");
		}
		
	}

	private static void ContainsMethod(ArrayList<String> arraylist,Object copy,List<Integer> list, List<String> list1) {
		System.out.println("ContainsMethod");
		System.out.println(arraylist.contains(98));
		System.out.println(arraylist.contains(copy.toString()));
		System.out.println(arraylist.contains(101));
		System.out.println(arraylist.containsAll(arraylist));
		System.out.println(arraylist.containsAll(list));
		System.out.println(arraylist.containsAll(list1));
		
	}
	

	private static void HashCodeMethod(ArrayList<String> arraylist,List<String> list1) {
		
		System.out.println("\nHashCodeMethod"+arraylist.hashCode());
		System.out.println(list1.hashCode());
	}

	private static void AddTheElements(List<String> arraylist,List<Integer> list, List<String> list1) {
		for(int i=1;i<=100;i++) {
			arraylist.add(String.valueOf(i));
			list.add(i);
			list1.add(String.valueOf(i));
		}
		
		
		
	}
		

}
