package com.demo.logicalProgramming;

public class Assignment1 {
	public static void main(String[] args) {
		// To find the sum of digits
		int num = 1234;
		int sum = 0;
		while(num != 0) {
			int di = num%10;
			sum = sum + di;
			num /= 10; 
		}
		System.out.println(sum);
		// To find the missing array number
		int [] arr1 = {1,2,4,5};
		int num1 = 5;
		int actual = 0;
		int total = num1 * (num1 + 1) / 2;
		for(int n : arr1) {
			actual += n;
		}
		System.out.println(total - actual  + " is missing");
		// To find Armstrong or not
		int n = 153;
		int temp = 0;
		int org = n;
		while(n != 0) {
			int d = n%10;
			int s = d*d*d;
			temp += s;
			n /= 10;
		}

		if(temp == org) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		// find words start with ch
		String [] nameArray = {"chandu","chari","anand","raju"};
		for(String letter : nameArray) {
			if(letter.startsWith("ch")) {
				System.out.println(letter);
			}
		}
		
		// To find duplicates in array
		int [] numberArray = {1,1,2,2,4,5};
		
		for(int i = 0;i<numberArray.length;i++) {
			for(int j = i+1;j<numberArray.length;j++) {
				if(numberArray[i] == numberArray[j]) {
					System.out.print(numberArray[i] + " ");
					
				}
			}
		}
		System.out.println(" ");
		
		// To find second largest in array
		int [] arr2 = {3,1,7,2};
		int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > largest) {
                secondLargest = largest;
                largest = arr2[i];
            } else if (arr2[i] > secondLargest && arr2[i] != largest) {
                secondLargest = arr2[i];
            }
        }

        if (secondLargest == 0) {
            System.out.println("No valid second largest element found.");
        } else {
            System.out.println(secondLargest);
        }
        //To split numbers and strings
        String input = "test 123 test1 234";
        String[] words = input.split(" ");

        for (String word : words) {
            String letters = "";
            String numbers = "";

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (ch >= '0' && ch <= '9') {
                    numbers += ch;
                } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    letters += ch;
                }
            }

            if (!letters.equals("")) {
                System.out.println("String: " + letters);
            }
            if (!numbers.equals("")) {
                System.out.println("Number: " + numbers);
            }
        }
		
	}
	

}
