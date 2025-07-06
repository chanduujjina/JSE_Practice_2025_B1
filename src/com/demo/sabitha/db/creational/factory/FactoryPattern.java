package com.demo.sabitha.db.creational.factory;

public class FactoryPattern {
	public static void main(String[] args) throws Exception  {
		try {
			 TopsType instaceTop = TopTypeDemo.getInstaceTop("TShirts");
			 instaceTop.Tops();
			 TopsType instaceTop1 = TopTypeDemo.getInstaceTop(null);
			 instaceTop1.Tops();
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		TopsType instaceTop2 = TopTypeDemo.getInstaceTop("asdf");
		 instaceTop2.Tops();
		
	}

}
