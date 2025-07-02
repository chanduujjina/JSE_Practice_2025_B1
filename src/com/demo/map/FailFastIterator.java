package com.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FailFastIterator {
	public static void main(String[] args) {
     Map<Integer, String> map=new HashMap<>();
     map.put(1, "demo1");
     map.put(2, "demo2");
     map.put(3, "demo3");
     map.put(4, "demo4");
     map.put(5, "demo5");
     for(Entry<Integer, String> a:map.entrySet()) {
    	 map.put(12, null);
     }
  
     
	}

}
