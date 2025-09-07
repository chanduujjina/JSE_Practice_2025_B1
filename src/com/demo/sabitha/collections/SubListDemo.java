package com.demo.sabitha.collections;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SubListDemo {
	public static void main(String[] args) {
		List<Integer> list1=AddElement(1025);
		Integer Threshold=100;
		Integer Startindex=0;
		Integer Endindex=Threshold;
		Integer NoOfSublist=list1.size()/Threshold;
		for(int i=0;i<NoOfSublist;i++) {
			List<Integer> sublist=list1.subList(Startindex,Endindex);
			System.out.println(sublist);
			Startindex=Endindex;
			Endindex=Endindex+Threshold;
		}
		Integer remain=list1.size()%Threshold;
		if(remain>0) {
			List<Integer> sublist1=list1.subList(Startindex,list1.size()-1);
			System.out.println(sublist1);
		}
		
		
	}

	private static List<Integer> AddElement(Integer Element) {
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=Element;i++) {
			list.add(i);
		}
		return list;
		
	}
	
	
		
}
	