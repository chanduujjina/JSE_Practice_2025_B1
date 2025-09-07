package com.demo.oops.sabitha.datatype;
public class AutoBoxing {
	public static void main(String[] args) {
		int val1=10;
		Float val=(float)val1;
		char s=(char) val1;
		
		System.out.println(val1);
		System.out.println(val);
		System.out.println(s);
		Integer a=null;
		int x;
		//all wrapper type default value is null must and should check 
		if(a!=null)
			x=a;
		
	}

}
