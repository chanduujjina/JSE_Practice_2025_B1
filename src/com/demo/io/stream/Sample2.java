package com.demo.io.stream;

import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Sample2 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1471316342848839502L;
	

	private int sampleId;
	
	private String sampleName;
	
	private String description;

	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + ", description=" + description + "]";
	}

	public Sample2(int sampleId, String sampleName, String description) {
		super();
		this.sampleId = sampleId;
		this.sampleName = sampleName;
		this.description = description;
	}
	
	
	public Object readResolve() throws NotSerializableException {
		
		throw new NotSerializableException();
	}

}
