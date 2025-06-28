package com.demo.dp.creational.pattern.singleton;

public class SingletonDemo1 {
	
	public static void main(String[] args) {
		
		//requesting first time for the object
		DBConnection connection1 = DBConnectionUtil.getConnection();
		
		//requesting second time for the object
		
		DBConnection connection2 = DBConnectionUtil.getConnection();
		
		System.out.println("hashcode of connection1 "+connection1.hashCode());
		
		System.out.println("hashcode of connection2 "+connection2.hashCode());
		
         // to load heavy weight object we can use singleton dp
		//if we are requesting for object mutiple times it will return the same instance
		//For DB Connection Objects and Caching technique etc .. we can use Singleton dp
	}

}
