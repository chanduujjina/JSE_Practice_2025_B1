package com.demo.sabitha.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
//it follows insert order
public class VetorDemo1 {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(12);
		vector.add(13);
		vector.add(18);
		vector.add(80);
		vector.add(45);
		vector.add(60);
		System.out.println("Enumeration ");
		Enumeration<Integer> elements = vector.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		System.out.println("Iterator ");
		Iterator<Integer> iterator=vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("LinkedList Iterator");
		ListIterator<Integer> listIterator=vector.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
	}

}
