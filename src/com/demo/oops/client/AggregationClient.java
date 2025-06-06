package com.demo.oops.client;

import com.demo.oops.Car;
import com.demo.oops.Engine;
import com.demo.oops.Wheel;

public class AggregationClient {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine(1, "testEngine");
		
		Wheel wheel = new Wheel("back", "testWheel");
		
		Car car  = new Car(engine, wheel,"testCar");
		
		System.out.println(car.toString());
	}

}
