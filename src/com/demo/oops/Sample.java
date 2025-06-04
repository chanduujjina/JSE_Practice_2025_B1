package com.demo.oops;

public class Sample {
	
	private int sampleId;
	
	
	private String sampleName;
	
	private String descrption;
	
	//No Arg Construcor
	public Sample() {
		
	}
	
	public Sample(int sampleId,String sampleName) {
		this.sampleId =1;
		this.sampleName = sampleName;
	}
	
	public Sample(int sampleId,String sampleName,String descrption) {
		this.sampleId =1;
		this.sampleName = sampleName;
		this.descrption = descrption; 
	}
	
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + ", descrption=" + descrption + "]";
	}


}
