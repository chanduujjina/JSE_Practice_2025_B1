package com.demo.sabitha.set;
import java.util.TreeSet;
public class TreeSetDemo2 {
	
	public static void main(String[] args) {
		TreeSet<String> set=addElements(20);
		System.out.println(set);	
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
		set.add(" ");
		set.add(null);
		return set;
		
		
	}
	

}
