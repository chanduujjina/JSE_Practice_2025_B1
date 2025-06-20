package com.demo.oops;

public class Test {
	
	

	private int id;
	
	private String name;
	
	public Test(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Test test = new Test(1,"sample");
		test.m1(test);//hard stop
		test.m2(test);
		test.m3(test);
		System.out.println(test.toString());
	}
	

	public void m1(Test test) {
		test = null;
		//System.out.println(test.toString());
	}
	
	public void m2(Test test) {
		test.setId(2);
		test.setName("test1");
	}
	
	public void m3(Test test) {
		
		test.setId(3);
		test.setName("test2");
	}
	
	
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + "]";
	}

}
