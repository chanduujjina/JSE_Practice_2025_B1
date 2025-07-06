package com.demo.sabitha.dp.creational;
public class SingletonDemo {
	public static void main(String[] args) {
		DBConnection connection = DBConnectionUtil.getConnection();
		System.out.println(connection);
		DBConnection connection2 = DBConnectionUtil.getConnection();
		System.out.println(connection2);
	}

}
