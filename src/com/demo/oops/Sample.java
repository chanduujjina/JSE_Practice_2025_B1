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
	
	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
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
