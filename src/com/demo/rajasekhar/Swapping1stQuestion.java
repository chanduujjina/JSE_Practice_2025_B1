/*1. Swapping two numbers without a third variable.*/

package com.demo.rajasekhar;

public class Swapping1stQuestion {
	public static void main (String[] args) {
        int a = 10;
        int b = 25;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}

