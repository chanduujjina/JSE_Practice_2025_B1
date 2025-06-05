package com.demo.oops;

public class Car {
	

	private Engine engine;
	
	

	private Wheel wheel;
	
	private String carName;
	
	public Car(Engine engine,Wheel wheel,String carName) {
		this.engine = engine;
		this.wheel =wheel;
		this.carName = carName;
		
	}
	

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheel=" + wheel + ", carName=" + carName + "]";
	}
	
	

}
