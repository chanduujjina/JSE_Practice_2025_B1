package com.demo.oops;

public class Sample2 {
	
	private int sampleId;
	
	
	private String sampleName;
	
	private String descrption;
	
	//No Arg Construcor
	public Sample2() {
		System.out.println("Inside No Arg Construcor ");
	}
	
	private Sample2(int sampleId,String sampleName) {
		System.out.println("Inside two Arg Construcor sampleId "+ sampleId+" sampleName:: "+sampleName);
		this.sampleId =1;
		this.sampleName = sampleName;
	}
	
	public Sample2(int sampleId,String sampleName,String descrption) {
		this(sampleId,sampleName);
		System.out.println("Inside three Arg Construcor sampleId "+ sampleId+" sampleName:: "+sampleName + "descrption:"+descrption);
		this.descrption = descrption; 
	}
	
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + ", descrption=" + descrption + "]";
	}
	
	public void m1() {
		System.out.println("Inside m1 method:");
		m2(this);
	}
	
	public void m2(Sample2 sample) {
		
		System.out.println("Inside m2 method:"+sample.toString());
	}
	


}
