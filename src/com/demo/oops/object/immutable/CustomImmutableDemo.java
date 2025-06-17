package com.demo.oops.object.immutable;

public class CustomImmutableDemo {
	
	public static void main(String[] args) {
		CustomImmutable customImmutable = new CustomImmutable(1, "test");
		System.out.println(customImmutable.getName());
		
		CustomImmutable customImmutable1 = new ChildImmutable(2, "test1");
		System.out.println(customImmutable1.getName());
		
		int value = customImmutable1.getValue();
		System.out.println(value);
		
		customImmutable1.m1(3);
		
		System.out.println(customImmutable1.getId());
		
	
	}
	

}

class CustomImmutable {
	

	@Override
	public String toString() {
		return "CustomImmutable [id=" + id + ", name=" + name + "]";
	}

	private int id;
	private String name;
	
	public CustomImmutable(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public int getValue(){
		return 1;
	}
	
	public void m1(int id) {
		this.id = id;
	}
	
}

class ChildImmutable extends CustomImmutable{
	
	public ChildImmutable(int id,String name) {
		super(id,name);
	}
	
	@Override
	public int getValue(){
		return 2;
	}
	
	
	
}
