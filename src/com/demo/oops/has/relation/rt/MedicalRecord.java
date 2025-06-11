package com.demo.oops.has.relation.rt;

import java.util.Arrays;

public class MedicalRecord {
	
	

	private String diagnosis;
	
	private String[] prescriptions = new String[1];
	
	
	public MedicalRecord(String diagnosis) {
		super();
		this.diagnosis = diagnosis;
	}
	
	public void addPrescription(String prescriptionName) {
		prescriptions[0] = prescriptionName;
	}

	@Override
	public String toString() {
		return "MedicalRecord [diagnosis=" + diagnosis + ", prescriptions=" + Arrays.toString(prescriptions) + "]";
	}

}
