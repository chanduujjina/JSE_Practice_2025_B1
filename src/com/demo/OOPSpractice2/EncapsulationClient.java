package com.demo.OOPSpractice2;

import com.demo.OOPSpractice.EncapsulationDemo;

public class EncapsulationClient {
	public static void main(String[] args) {
		EncapsulationDemo student = new EncapsulationDemo();
		student.setName("Abhiram");
		student.setid(0);
		System.out.println(student.getname());
		System.out.println(student.getid());
	}

}
