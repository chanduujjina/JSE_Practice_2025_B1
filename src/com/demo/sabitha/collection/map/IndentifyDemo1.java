package com.demo.sabitha.collection.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IndentifyDemo1 {
	public static void main(String[] args) {
		Map<Employe,String> map=new IdentityHashMap<>();
		map.put(new Employe(1,"test"),"sample");
		map.put(new Employe(2,"test2"), "sample1");
		map.put(new Employe(2,"test2"), "sample2");
		System.out.println(map);
	}

}
