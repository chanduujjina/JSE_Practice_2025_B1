package com.demo.oops.objectinfo;

import java.util.Objects;

public class Sample {
	
	

	//instance variable
	private int sampleId;
	
	private String sampleName;
	
	//constructor
	public Sample(int sampleId,String sampleName) {
		this.sampleId = sampleId;
		this.sampleName = sampleName;
	}
	
	//setters and getters

	public int getSampleId() {
		return sampleId;
	}

	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}

	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + "]";
	}

	public String getSampleName() {
		return sampleName;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(sampleId, sampleName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		return sampleId == other.sampleId && Objects.equals(sampleName, other.sampleName);
	}

}
