package com.demo.sabitha.objectinfo.growableArray;

import com.demo.oops.objectinfo.Sample;

public class CustomArray1 {
	private Sample sample[];
	int count=0;
	public CustomArray1() {
		sample=new Sample[1];
	}
	public void addElements(Sample sample1) {
		if(sample[0]==null) {
			sample[0]=sample1;
		}
		else {
			Sample[] samplearray=new Sample[sample.length+1];
			System.arraycopy(sample,0, samplearray,0,sample.length);
			samplearray[count]=sample1;
			sample=samplearray;
		}
		count++;
	}
	public Sample[] getElement() {
		return this.sample;
		
	}

}
