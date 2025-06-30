package com.demo.sabitha.vector;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.Vector;
//it follows insert order
public class VetorDemo2 {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>(10);
		addElement(vector);
		indexOf(vector);
		toArrayaMethod(vector);
		
	}
	
	private static void toArrayaMethod(Vector<Integer> vector) {
		Object[] array = vector.toArray();
		System.out.println(Arrays.toString(array));
		
	}
	private static void indexOf(Vector<Integer> vector) {
		System.out.println(vector.indexOf((Object)5));
		System.out.println(vector.indexOf(5));
		System.out.println(vector.lastIndexOf((Object)6));
		System.out.println(vector.indexOf((Object)3, 2));
	}

	private static void addElement(Vector<Integer> vector) {
		for(int i=1;i<vector.capacity();i++) {
			vector.add(i);
		}
	}

	

}
