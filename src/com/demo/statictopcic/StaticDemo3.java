package com.demo.statictopcic;

public class StaticDemo3 {
	
	private static Test test = new Test();
	
	static {
		test.setId(1);
		test.setName("test");
	}
	
	
	public Test getInstance() {
		return test;
	}
	

}
