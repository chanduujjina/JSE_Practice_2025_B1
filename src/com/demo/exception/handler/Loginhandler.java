package com.demo.exception.handler;

public class Loginhandler {
	
	
	public static void main(String[] args) {
		Loginhandler loginhandler = new Loginhandler();
		try {
			String response = loginhandler.handleLogin("test", "test");
			System.out.println(response);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String handleLogin(String userName,String password) throws Exception {
		
		if (userName == null || userName.isEmpty()) {
			
			throw new Exception("username must not be empty");
		}
		if (password == null || password.isEmpty()) {
			throw new Exception("password must not be empty");
		}
		
		return "Success";
	}

}
