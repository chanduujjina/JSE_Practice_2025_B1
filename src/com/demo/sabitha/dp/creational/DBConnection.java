package com.demo.sabitha.dp.creational;

public class DBConnection {
	private String url;
	private String username;
	private String password;
	public DBConnection(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "DBConnection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}
