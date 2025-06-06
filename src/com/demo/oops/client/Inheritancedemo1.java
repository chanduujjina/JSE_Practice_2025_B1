package com.demo.oops.client;

import com.demo.oops.Child;

public class Inheritancedemo1 {
	
	public static void main(String[] args) {
		
		Child child = new Child("parent",1,"child",1);
		
		int id = child.getId();
		
		String type = child.getType();
		
		int childId = child.getChildId();
		
		String childType = child.getChildType();
		
		System.out.println("id :"+id+ "	type:"+type+ "	childId "+childId+"	childType:"+childType);
		
		System.out.println(child.toString());
		
	}

}
