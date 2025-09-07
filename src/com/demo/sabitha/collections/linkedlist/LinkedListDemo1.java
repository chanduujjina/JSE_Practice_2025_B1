package com.demo.sabitha.collections.linkedlist;

import java.util.LinkedList;


public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<>();
		LinkedList<String> list=new LinkedList<>();
		list.add("10");
		list.add("90");
		list.add("chandu");
		list.offer("200");//queue
		list.offerFirst("0");
		list.offerLast("akki");
		
		linkedList.add("12");
		linkedList.add("sabitha");
		linkedList.add("teja");
		linkedList.add("sai");
		linkedList.add("13");
		linkedList.add("2");
		linkedList.add("Keerthana");
		linkedList.addFirst("1");
		linkedList.addLast("sree");
		linkedList.addAll(list);

		System.out.println(linkedList);
		
	}

}
