package com.demo.sabitha.constructer.exception;

public class Demo18{
	public static void main(String[] args){
			Child9 child=new Child9();
	}

}
class Parent9{
	public Parent9(){
		System.out.println("parent");
		
	}
}
class Child9 extends Parent9{
	public Child9()throws IllegalArgumentException{
		System.out.println("child");
		
	}
	
}
