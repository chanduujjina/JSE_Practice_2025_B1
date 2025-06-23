package com.demo.OOPSpractice;

public abstract class Ad {
	void m() { //Concrete method
		
	}
	abstract void m2() throws Throwable;
	
}
class Child1 extends Ad{
	public void m2() throws RuntimeException {
		
	}
}

