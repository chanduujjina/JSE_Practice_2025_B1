package com.demo.oops.object.immutable;

public final class CustomImmutable1 {
	
	@Override
	public String toString() {
		return "CustomImmutable1 [id=" + id + ", name=" + name + "]";
	}

	private final int id;
	private final String name;
	
	public CustomImmutable1(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public final void m1() {
		System.out.println("Inside m1");
	}
	
	public static void main(String[] args) {
		CustomImmutable1 customImmutable1 = new CustomImmutable1(1, "test");
		
		System.out.println(customImmutable1);
	}
	

}
