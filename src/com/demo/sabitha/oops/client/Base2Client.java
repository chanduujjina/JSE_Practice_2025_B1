package com.demo.sabitha.oops.client;

import com.demo.sabitha.oops.*;

public class Base2Client {
	public static void main(String args[]) {
		Base2 b2=new Base2("sabitha");
		System.out.println(b2.gettype());
		b2.settype("teja");
		b2.print();
		System.out.println(b2.x);
		System.out.println(Base2.x1);
	}

}
