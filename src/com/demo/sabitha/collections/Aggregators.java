package com.demo.sabitha.collections;
import java.util.*;

public class Aggregators {
	public static void main(String[] args) {
		List<Integer> list=AddTheElements(10);
		List<Integer> list2= AddTheElements(200);
		int sum=0;
		int sum1=SumMethod(list,sum);
		MaxMethod(list);
		MinMethod(list);
		AverageMethod(list,sum1);
		
	}
	

	private static void AverageMethod(List<Integer> list, int sum) {
		float ave=sum/list.size();
		System.out.println("Average of list"+ave);
		
		
	}


	private static void MinMethod(List<Integer> list) {
		System.out.println("min value in a list "+Collections.min(list));
		
	}


	private static void MaxMethod(List<Integer> list) {
		System.out.println("Max value in a list  "+Collections.max(list));
	}


	private static int SumMethod(List<Integer> list,int sum) {
		
		for(int i=1;i<=list.size();i++) {
			sum+=i;
		}
		System.out.println("sum of list value"+sum);
		return sum;
	}


	private static List<Integer> AddTheElements(Integer list){
		List<Integer> list2=new ArrayList<>();
		for(int i=1;i<=list;i++) {
			list2.add(i);
		}
		return list2;
	}
	
		
}
	