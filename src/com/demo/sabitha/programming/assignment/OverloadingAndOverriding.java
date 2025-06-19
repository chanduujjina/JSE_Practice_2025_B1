package com.demo.sabitha.programming.assignment;
 class RuntimeAndCompileTime{
	public void m1(int x){
		System.out.print("base");
		System.out.println(x);
	}
	public void m1(String x) {
		System.out.println(x);
	}
	public char m2(long x) {
		System.out.println(x);
		return 'A';
		
	}
} 
 class RuntimeAndCompileTime1 extends RuntimeAndCompileTime{
	 @Override
		public char m2(long x) {
			System.out.println(x);
			return 'a';
		}

	@Override
	public void m1(int x) {
		super.m1(x);
	}
	 
 }
class OverloadingAndOverriding  {
	public static void main(String[] args) {
		System.out.println(new RuntimeAndCompileTime1().m2(1234));
		new RuntimeAndCompileTime1().m1(10);;
	
	}

}
