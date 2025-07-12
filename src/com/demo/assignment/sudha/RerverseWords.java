package com.demo.assignment.sudha;

public class RerverseWords {
	public static void main(String[] args) {
		String name = "Hello World!";
		String[] split=name.split(" ");
		for(String s:split) {
			StringBuilder builder=new StringBuilder();
			builder.append(s);
			System.out.println(builder.reverse()+ " ");
			
		}
	}
	

}
