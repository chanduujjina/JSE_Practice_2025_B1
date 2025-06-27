package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SubListDemo {
	public static void main(String[] args) {
		List<Integer> list1=AddElement(128);
		Integer threshHold=10;
		Integer StartIndexa=0;
		Integer Endindex=threshHold;
		Integer NoOfSublist=list1.size()/threshHold;
	
		for(int i=0;i< NoOfSublist;i++) {
			List<Integer> Sublist=list1.subList(StartIndexa, Endindex);
			System.out.println(Sublist);
			StartIndexa=Endindex;
			Endindex=Endindex+threshHold;
			
		}
		Integer remain =list1.size()%threshHold;
		if(remain>0) {
			List<Integer> sublist1=list1.subList(StartIndexa,list1.size()-1);
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