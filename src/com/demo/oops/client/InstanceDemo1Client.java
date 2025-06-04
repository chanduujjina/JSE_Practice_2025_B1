package com.demo.oops.client;

import com.demo.oops.InstanceDemo1;

public class InstanceDemo1Client {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<?> cls = Class.forName("com.demo.oops.InstanceDemo1");
		
		InstanceDemo1 instanceDemo1 = (InstanceDemo1)cls.newInstance();
	}

}
