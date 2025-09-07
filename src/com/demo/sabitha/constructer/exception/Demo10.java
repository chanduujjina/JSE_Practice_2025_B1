package com.demo.sabitha.constructer.exception;
public class Demo10{
	public static void main(String[] args){
			Child6 child=new Child6();
	}

}
class Parent6{
	public Parent6()throws IndexOutOfBoundsException {
		System.out.println("parent");
		
	}
}
class Child6 extends Parent6{
	public Child6()throws ArrayIndexOutOfBoundsException{
		System.out.println("child");
		
	}
	
}
