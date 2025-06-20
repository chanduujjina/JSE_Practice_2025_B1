package com.demo.staticinfo.and.nonstatic;

public class Demo2 {
	
	  static int x = 10;//100
	    int y = 20;
	
	public static void main(String[] args) {
		Demo2 t1 = new Demo2();// x =100, y= 20
		Demo2 t2 = new Demo2();// x= 100 y =200
	        t1.x = 100;
	        t2.y = 200;
	        System.out.println(t2.x + " " + t1.y);
	}

}
