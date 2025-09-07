package com.demo.sabitha.objectinfo.growableArray;

public class CustomArray3 {
	private char[] charArray ;
	int count=0;
	public CustomArray3() {
		charArray =new char[1];
	}
	public void Addelements(char value) {
		if(charArray[0]==0) {
			charArray[0]=value;
		}
		else {
			char[] newcharArray=new char[charArray.length+1];
			System.arraycopy(charArray, 0, newcharArray, 0,charArray.length);
			newcharArray[count]=value;
			charArray=newcharArray;
		}
		count++;
	}
	public char[] getElement() {
		return this.charArray;
		
	}
	public  char indexof(int value) {
		return charArray[value];
	}

}
