package com.demo.sabitha.set;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class TreeSetDemo3 {
	
	public static void main(String[] args) {
		TreeSet<String> set=addElements(20);
		returnValueMethod(set);
		headSetMethod(set);
		tailSetMethod(set);
		subsetMethod(set);	
	}
	private static void subsetMethod(TreeSet<String> set) {
		System.out.println("------------------------subset & ceilling-----------------------");
		String ceiling = set.ceiling("keerthana");
		System.out.println(ceiling);
		SortedSet<String> subSet = set.subSet("cherry", "sai");
		System.out.println(subSet);
		
		
		
	}
	private static void tailSetMethod(TreeSet<String> set) {
		System.out.println("---------------------- tailSet------------------------");
		SortedSet<String> tailSet = set.tailSet("sai");
		System.out.println(tailSet);
		NavigableSet<String> subSet2 = set.subSet("cherry",false, "t",true);
		System.out.println(subSet2);
		
	}
	private static void headSetMethod(TreeSet<String> set) {
		System.out.println("---------------------headset------------------");
		SortedSet<String> headSet = set.headSet("sai");
		System.out.println(headSet);
		NavigableSet<String> headSet2 = set.headSet("hello", true);
		System.out.println(headSet2);
		
		
	}
	private static void returnValueMethod(TreeSet<String> set) {
		System.out.println("first value it return  "+set.first());
		System.out.println("last value it return  "+set.last());
		System.out.println("-------------------Lower------------------------------");
		System.out.println(set.lower("keer"));
		System.out.println(set.lower("s"));
		System.out.println(set.lower("a"));
		System.out.println(set.lower("Sai"));
		System.out.println("----------------floor---------------------");
		System.out.println(set.floor("sree"));
		System.out.println(set.floor("sabitha"));
		System.out.println(set.floor("c"));
		System.out.println(("-----------------higher----------------------------------------"));
		System.out.println(set.higher("sai"));
		System.out.println(set.higher("f"));
		System.out.println(set.higher("z"));
		System.out.println(set.higher("Sabitha"));
		
		
		
	}
	private static TreeSet<String> addElements(int element) {
		TreeSet<String> set=new TreeSet<>();
		set.add("hello");
		set.add("sai");
		set.add("sabitha");
		set.add("teja");
		set.add("vara");
		set.add("cherry");
		set.add("keerthana");
		set.add("devi");
		set.add("teja");
		return set;
		
		
	}
	

}
