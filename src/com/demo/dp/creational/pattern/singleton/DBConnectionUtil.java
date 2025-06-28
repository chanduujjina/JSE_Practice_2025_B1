package com.demo.dp.creational.pattern.singleton;

public class DBConnectionUtil {
	
	private static DBConnection connection;//storing at global level
	
	private DBConnectionUtil() {
		
	}
	
	public static DBConnection getConnection() {
		if (connection == null) {//creating for first request only
			connection = new DBConnection("localhost:8080/testdb", "root", "root");
		}
		return connection;// from second request unwards it will retun instance creating at first request instead of creating new Object
	}

}
