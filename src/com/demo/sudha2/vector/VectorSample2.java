package com.demo.sudha2.vector;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class VectorSample2 {
	public static void main(String[] args){
		Vector<String> Sudha=new Vector<>(6);
		addElement(Sudha);
		indexOf(Sudha);
		toArrayMethod(Sudha);
	
		System.out.println(Sudha);
		

	}


	private static void toArrayMethod(Vector<String> sudha) {
		Object[] array=sudha.toArray();
		System.out.println(Arrays.toString(array));
		
	}





	private static void indexOf(Vector<String> sudha) {
		System.out.println(sudha.indexOf((Object)"2"));
		System.out.println(sudha.indexOf((Object)"5"));
		System.out.println(sudha.lastIndexOf((Object)"2"));
		System.out.println(sudha.indexOf("3"));
	}





	private static void addElement(Vector<String> Sudha) {
	for (int i=1;i<Sudha.capacity();i++) {
		Sudha.add(String.valueOf(i));
		
	}
		

	}

}
