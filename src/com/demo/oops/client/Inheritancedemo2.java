package com.demo.oops.client;

import com.demo.oops.Child;
import com.demo.oops.Parent;

public class Inheritancedemo2 {
	
	public static void main(String[] args) {
		
		Parent parent = new Child("parent",1,"child",1);
		
		int id = parent.getId();
		
		String type = parent.getType();
		
		/*int childId = parent.getChildId();
		
		String childType = parent.getChildType();*/
		
		System.out.println("id :"+id+ "	type:"+type);
		
		System.out.println(parent.toString());
		
	}

}
