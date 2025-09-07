package com.demo.sabitha.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ObjectMapDemo {
	public static void main(String[] args) {
		Employe employe=new Employe(1, "sabitha");
		
		Map<Employe,Integer> map=new HashMap<>();
		map.put(employe,1);
		map.put(new Employe(1,"sabitha"),2);
		map.put(employe,3);
		map.put(new Employe(2,"sabitha"), 3);
		map.put(new Employe(0, null),4);
		System.out.println(map);
		
	}

}
