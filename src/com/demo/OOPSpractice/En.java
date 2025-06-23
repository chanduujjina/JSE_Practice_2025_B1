package com.demo.OOPSpractice;

import java.util.Objects;

public class En {
	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		En other = (En) obj;
		return age == other.age;
	}
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	private En() {
		
	}
	
	public En(int age) {
		this();
		this.age=age;
	}
	

}

