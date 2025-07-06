package com.demo.sabitha.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaturalSorting {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("sabitha");
		list.add("teja");
		list.add("keerthana");
		list.add("akki");
		list.add("cherry");
		list.add("sai");
		list.add("sai1");
		list.add("sree");
		SortMethod(list);
		
	}

	private static void SortMethod(List<String> list) {
		Collections.sort(list);
		System.out.println(list);
		
	}

}
