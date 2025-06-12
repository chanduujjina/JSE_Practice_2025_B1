package com.demo.oops.polymorphism;

public class StaticInheritanceHandler1 {
	
	
	
	public static void main(String[] args) {
		//to achieve the abstraction
		//request1
		ParentInfo parentInfo = new ChildInfo();
		
		parentInfo.m1();
		parentInfo.m2();
		
		parentInfo.m3();
		
		//request 2
		
		ChildInfo childInfo = new ChildInfo();
		childInfo.m2();
		
	}
	
	

}

 class ParentInfo {
	
	 public void m1() {
		 System.out.println("inside m1 ParentInfo class");
	 }
	 
	 public static void m2() {
		 System.out.println(" Inside static void m2() ParentInfo class ");
	 }
	 
	 public void m3() {
		 System.out.println("inside m3 ParentInfo class");
	 }
}
 
 class ChildInfo extends ParentInfo {
	 
	 @Override
	 public void m1() {
		 System.out.println("inside m1 ChildInfo class");
	 }
	 
	 
	 public static void m2() {
		 System.out.println(" Inside static void m2() ChildInfo class ");
	 }
 }
