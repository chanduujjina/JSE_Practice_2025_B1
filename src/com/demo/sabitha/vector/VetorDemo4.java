package com.demo.sabitha.vector;
import java.util.List;
import java.util.Vector;
//it follows insert order
public class VetorDemo4 {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>(1250);
		addElements(vector);
		sublistMethod(vector);
		
		
	}

	private static void sublistMethod(Vector<Integer> vector) {
		int threhold=100;
		int start=1;
		int end=100;
		int onOFSublist=vector.size()/threhold;
		for(int i=0;i<onOFSublist;i++) {
			List<Integer> vector1=vector.subList(start, end);
			System.out.println(vector1);
			start=end;
			end=end+threhold;
		}
		int remain=vector.size()%threhold;
		if(remain>0) {
			List<Integer> vector2=vector.subList(start,vector.size());
			System.out.println(vector2);
		}
		
		
	}

	private static void addElements(Vector<Integer> vector) {
		for(int i=1;i<=vector.capacity();i++) {
			vector.add(i);
		}
		
		
	}
}
