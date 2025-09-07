package com.demo.sabitha.db.creational.factory;

public class TopTypeDemo {
	public static TopsType getInstaceTop(String type) throws Exception {
		if(type==null) {
			throw new Exception("type should not be empty or null");
		}
		switch(type) {
		case "TShirts":
			return new TShirts();
		case "CropTops":
			return new CropTops();
		case "TankTops":
			return new TankTops(); 
		default:
			throw new UnsupportedOperationException("Exception"+type);
		}
	}

}
