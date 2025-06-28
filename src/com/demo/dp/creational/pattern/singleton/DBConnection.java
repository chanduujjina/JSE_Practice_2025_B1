package com.demo.dp.creational.pattern.singleton;

public class DBConnection {
	
	private String url;
	private String userName;
	
	private String password;

	public DBConnection(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	
	

}
