package com.demo.Assinment2;

public class ArmStrongNumber {
	public int Count(int num,int count) {
		
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}
	public int Armstong(int num,int count) {
		int sum=0;
		while(num>0) {
			 sum=sum+(int)Math.pow(num%10, count);
			 num=num/10;
		}
		return sum;
	}
	public static void main(String args[] ) {
		int num=15;
		int t=num,count=0;
		int sum=new ArmStrongNumber().Armstong(t,new ArmStrongNumber().Count(t,count));
		if(num==sum)
			System.out.println("It is a Armstong Number");
		else
			System.out.println("it is a not Armstong Number");
		
	}
}
