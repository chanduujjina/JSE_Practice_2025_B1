package com.demo.OOPSpractice;

public class HasRelation {
	public static void main(String[] args) {
		HasRelation hs = new HasRelation();
		HasRelation.Car  car = hs.new Car();
		car.Carhas();
	}
	
	class Engine{
			void hasengine() {
			System.out.println("Engine is ready");
		}
	}
	class Car extends Engine {
		Engine engine = new Engine();
		
		void Carhas() {
			engine.hasengine();
			System.out.println("Car has a relation to Engine");
		}
	}
	

}
