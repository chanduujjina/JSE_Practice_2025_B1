package com.demo.sabitha.oop.object.immutable;

public final class FinalKeyword {
	final private String str;
	final private int x;
	public FinalKeyword(String str, int x) {
		super();
		this.str = str;
		this.x = x;
	}

	public String getStr() {
		return str;
	}
	
	public int getX() {
		return x;
	}
	final void  m1() {
		System.out.println("final cant asscess without class ");
	}
	public static void main(String[] args) {
		FinalKeyword b1=new FinalKeyword("sabitha",12);
		System.out.println(b1.getX());
		System.out.println(b1.getStr());
		b1.m1();
	}
	
	
	

}
//final keyword used  data we convent into immutable use final with one immutable in can defined the final  
/*class A extends FinalKeyword() {
 
	
}*/
