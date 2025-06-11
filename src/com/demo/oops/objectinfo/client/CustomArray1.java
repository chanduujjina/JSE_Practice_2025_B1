package com.demo.oops.objectinfo.client;

import com.demo.oops.objectinfo.Sample;

public class CustomArray1 {
	
	private Sample sampleArray [];
	
	int count =0;
	
	public CustomArray1() {
		sampleArray = new Sample[1];
	}
	
	
	public void add(Sample sample) {
		
		//search for index 0 to accomadate element
		if (sampleArray [0] == null) {
			sampleArray[0] =sample;
		}
		else {
			
			//create a new array by increment 1 with old array size
			Sample newSampleArray [] = new Sample[sampleArray.length+1];
			
			//copy the elements from old to new Array
			
			System.arraycopy(sampleArray, 0, newSampleArray, 0, sampleArray.length);
			newSampleArray[count] = sample;
			
			sampleArray = newSampleArray;
			
		}
		count++;
	}
	
	public Sample [] getArrayData() {
		return this.sampleArray;
	}
	
	public Sample findIndexOf(int index) {
		return sampleArray[index];
	}

}
