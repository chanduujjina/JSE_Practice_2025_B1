package com.demo.oops.objectinfo;

import java.util.Objects;

public class SampleInfo {
	
	

	//instance variable
	private int sampleId;
	
	private String sampleName;
	
	//constructor
	public SampleInfo(int sampleId,String sampleName) {
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
		SampleInfo other = (SampleInfo) obj;
		return sampleId == other.sampleId && Objects.equals(sampleName, other.sampleName);
	}

}
