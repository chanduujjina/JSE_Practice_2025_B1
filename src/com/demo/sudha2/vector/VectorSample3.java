package com.demo.sudha2.vector;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class VectorSample3 {
	public static void main(String[] args){
		Vector<String> Sudha=new Vector<>(8);
		Sudha.add("cherry");
		Sudha.add("banda");
		Sudha.add("abhi");
		Sudha.add("deepu");
		Sudha.add("sindhu");
		Sudha.add("chandu");
		Sudha.add("sabitha");
		Sudha.add("ram");
		SortMethod(Sudha);
	}

	private static void SortMethod(Vector<String> sudha) {
		Collections.sort(sudha);
		System.out.println(sudha);
		Collections.sort(sudha,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
		});

		System.out.println(sudha);
	}
	
	}



	
		

	


