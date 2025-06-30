package com.demo.sudha2.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class VectorSample1 {
	public static void main(String[] args) {
		
		Vector<String> Sudha=new Vector<>();
		Sudha.add("14");
		Sudha.add("56");
		Sudha.add("46");
		Sudha.add("33");
		Sudha.add("cherry");
		Enumeration<String> elements=Sudha.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		Iterator<String> iterator=Sudha.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Linkedlist Iterator");
		ListIterator<String> listiterator=Sudha.listIterator();
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		
		
	}

}
