package com.demo.sabitha.vector;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
//it follows insert order
public class VetorDemo3 {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>(10);
		vector.add(12);
		vector.add(45);
		vector.add(2);
		vector.add(32);
		vector.add(24);
		vector.add(3);
		vector.add(1);
		vector.add(1);
		vector.add(5);
		sortMethod(vector);
	}

	private static void sortMethod(Vector<Integer> vector) {
		Collections.sort(vector);
		System.out.println(vector);
		
		Collections.sort(vector,new Comparator<Integer>() {
			
			public int compare(Integer o1, Integer o2) {
			
				return o2-o1;
			}
		});
		System.out.println(vector);
		
	}
		

}
