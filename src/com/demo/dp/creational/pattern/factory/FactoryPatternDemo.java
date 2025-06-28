package com.demo.dp.creational.pattern.factory;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		
		try {
			Shape instance1 = ShapeFactory.getInstance("Rectangle");
			instance1.drawShape();
			
			Shape instance2 = ShapeFactory.getInstance("Square");
			instance2.drawShape();
			
			Shape instance3 = ShapeFactory.getInstance("Test");
			instance3.drawShape();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Shape instance4;
		try {
			instance4 = ShapeFactory.getInstance(null);
			instance4.drawShape();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
