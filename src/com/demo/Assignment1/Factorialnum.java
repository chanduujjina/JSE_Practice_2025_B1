package com.demo.Assignment1;

import java.util.Scanner;

public class Factorialnum {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int fac= 1;
		for(int i = num1 ; i >= 1; i--) {
			fac *= i;
		}
		System.out.print(fac);
		sc.close();
		
	}

}
