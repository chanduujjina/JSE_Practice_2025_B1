package com.demo.method;

public class VarArgDemo1 {
	
	public static void main(String[] args) {
		
		m1(1,2,3,4,5,6,7);
		
		//m2(1,"test","test1");
		
		//m3("test1","test2",1);
		
		//m4("test1",1,"test2");
		
		m5("test1","test2",1);
	}

	private static void m5(String v1 ,String v2, int ... i) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * private static void m4(String string, int ...v2 , String string2) {
	 * 
	 * 
	 * }
	 */

	/*
	 * private static void m3(String ... v2 , String str2, int i) {
	 * 
	 * 
	 * }
	 */

	/*
	 * private static void m2(int val, String ... str1, String str2) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	private static void m1(int v1, int ... v2) {
		
		System.out.println("vv1 is "+v1);
		
		for (int num : v2) {
			System.out.println(num);
		}
		
	}

}
