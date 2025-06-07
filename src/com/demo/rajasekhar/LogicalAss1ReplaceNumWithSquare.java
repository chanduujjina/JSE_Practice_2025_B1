package com.demo.rajasekhar;

public class LogicalAss1ReplaceNumWithSquare {
    public static void main(String[] args) {
    	int[] a = {1, 4, 9, 16};

    	System.out.print("Array with squares: ");
    	for (int i = 0; i < a.length; i++) {
    	    System.out.print(a[i]);
    	    if (i < a.length - 1) {
    	        System.out.print(", ");
    	    }
    	}
}
}