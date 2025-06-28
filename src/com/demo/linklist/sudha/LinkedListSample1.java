package com.demo.linklist.sudha;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample1 {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<>();
		LinkedList<String> list=new LinkedList<>();
		list.add("12");
		list.add("60");
		list.add("Ram");
		list.offer("120");//Queue
		list.offerFirst("2");
		list.offerLast("mrunal");
		
		linkedList.add("24");
		linkedList.add("cherry");
		linkedList.add("pandu");
		linkedList.add("deepu");
		linkedList.add("66");
		linkedList.add("32");
		linkedList.add("sudha");
		linkedList.addFirst("1");
		linkedList.addLast("sunny");
		linkedList.addAll(list);
		System.out.println(linkedList);
	}

}
