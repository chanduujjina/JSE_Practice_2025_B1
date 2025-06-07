package com.demo.rajasekhar;

public class LogicalAss1NthLargestNum {
    public static void main(String[] args) {
        int[] arr = {10, 40, 20, 50, 30};
        int n = 2;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if (n > 0 && n <= arr.length) {
            System.out.println(n + "th largest number is: " + arr[n - 1]);
        } else {
            System.out.println("Invalid N");
        }
    }
}

