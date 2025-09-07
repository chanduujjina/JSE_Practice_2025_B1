package com.demo.sabitha.objectinfo.growableArray;

public class CustomArray2 {
	private float [] Floatarray;
	int count=0;
	public CustomArray2() {
		Floatarray =new float[1];
	}
	public void Addelements(float value) {
		if(Floatarray[0]==0) {
			Floatarray[0]=value;
		}
		else {
			float [] newFloatarray=new float[Floatarray.length+1];
			System.arraycopy(Floatarray, 0, newFloatarray, 0,Floatarray.length);
			newFloatarray[count]=value;
			Floatarray=newFloatarray;
		}
		count++;
	}
	public float[] getElement() {
		return this.Floatarray;
		
	}
	public float indexof(int value) {
		return Floatarray[value];
	}

}
