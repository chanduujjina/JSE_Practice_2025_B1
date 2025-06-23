package com.demo.sabitha.constructer.exception;
public class Demo14{
	public static void main(String[] args) throws Exception{
			Child8 child=new Child8();
	}

}
class Parent8{
	public Parent8(){
		System.out.println("parent");
		
	}
}
class Child8 extends Parent8{
	public Child8()throws Exception{
		System.out.println("child");
		
	}
	
}
