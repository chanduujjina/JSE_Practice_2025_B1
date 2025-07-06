package com.demo.sabitha.dp.creational;
public class DBConnectionUtil {
	static DBConnection connect;
	public static DBConnection getConnection(){
		if(connect==null) {
			connect=new DBConnection("localhost:8088/database","host","host");
		}
		return connect;
		
	}
	

}
