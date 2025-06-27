package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Aggregatordemo1 {
	public static void main(String[] args) {
      List<Integer>list=AddtheElements(10);
      List<Integer>list2=AddtheElements(200);
      int sum=0;
      int sum1=SumMethod(list,sum);
      SumMethod(list,sum);
      MaxMethod(list);
      MinMethod(list);
      AverageMethod(list,sum1);

      
      
    
    
	
	
	}

	private static void AverageMethod(List<Integer> list, int sum1) {
		float avg=sum1/list.size();
	System.out.println("Average of list"+avg);
	}

	private static void MinMethod(List<Integer> list) {
	System.out.println("Min value in a list"+Collections.min(list));
	}

	private static void MaxMethod(List<Integer> list) {
		System.out.println("Max value in a list"+Collections.max(list));
	}

	private static int SumMethod(List<Integer> list, int sum) {
		
		for(int i =1;i<list.size();i++) {
			sum+=i;
			
		}
		System.out.println("sum of arraylist elements "+sum);
		return sum;
	}

	private static List<Integer> AddtheElements(int element) {
		List<Integer>list2=new ArrayList<>();
		for(int i=1;i<=element;i++) {
			list2.add(i);
			
			
		}
				return list2;
	}
}		