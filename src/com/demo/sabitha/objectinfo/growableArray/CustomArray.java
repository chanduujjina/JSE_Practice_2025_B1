package com.demo.sabitha.objectinfo.growableArray;
//this is used for the composition object overcome the array problem 
public class CustomArray {
	private  int [] number;
	int count=0;
	public CustomArray() {
		number =new int[1];
	}
	 public void add(int value) {
		 if(number[0]==0) {
			 number[0]=value;
		 }
	else {
			 int [] newnumber=new int[number.length+1];
			 System.arraycopy(number,0, newnumber,0,number.length);
			 newnumber[count]=value;
			 number=newnumber;
			}
		 count++;
	 }
	 public int[] getarray() {
		 return number;
	 }
	 public int findIndex(int index) {
		 return number[index];
	 }

}
