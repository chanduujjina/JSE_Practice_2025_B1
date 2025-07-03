package com.demo.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexmechanismDemo1 {
	
	public static void main(String[] args) {
		
		//UI
		List<Integer> numberList1 = new ArrayList();
		numberList1.add(1);
		numberList1.add(2);
		numberList1.add(3);
		numberList1.add(4);
		
		//DB
		List<Integer> numberList2 = new ArrayList<>();
		numberList2.add(5);
		numberList2.add(6);
		numberList2.add(3);
		numberList2.add(4);
		
		Map<Integer, Integer> map1 = new HashMap<>();
		for (int val : numberList1) {
			map1.put(val, val);
		}
		
		Map<Integer, Integer> map2 = new HashMap<>();
		for (int val : numberList2) {
			map2.put(val, val);
		}
		
		List<Integer> commList = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {//indexing
			Integer val = map2.get(entry.getKey());
			
			if (val != null) {
				commList.add(val);
			}
		}
		
		System.out.println(commList);
	}

}
