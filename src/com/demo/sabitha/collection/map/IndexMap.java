package com.demo.sabitha.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IndexMap {
		
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
			
			Map<String, Integer> map1 = new HashMap<>();
			for (int val : numberList1) {
				map1.put("test"+val, val);
			}
			
			Map<String, Integer> map2 = new HashMap<>();
			for (int val1 : numberList2) {
				map2.put("test"+val1, val1);
			}
			
			
			List<Integer> commList = new ArrayList<>();
			for (Entry<String, Integer> entry : map1.entrySet()) {//indexing
				 Integer val=map2.get(entry.getKey());
				if (val != null) {
					commList.add(val);
				}
			}
			
			System.out.println(commList);
		}

	}
