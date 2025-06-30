package com.demo.dp.creational.pattern.factory;

public class ShapeFactory {

	public static Shape getInstance(String type) throws Exception {
		
		if (type == null) {
			throw new Exception("type should not be empty or null");
		}

		switch (type) {
		case "Rectangle": {

			return new Rectangle();
		}

		case "Square": {

			return new Square();
		}

		default:
			throw new UnsupportedOperationException("Unexpected value: " + type);
		}
	}
	//Need of factory dp -> To Achieve the abstraction

}
