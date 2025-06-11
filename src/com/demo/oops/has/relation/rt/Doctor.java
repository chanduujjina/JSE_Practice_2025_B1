package com.demo.oops.has.relation.rt;

public class Doctor {
	
	public Doctor(String name) {
		super();
		this.name = name;
	}

	private String name;
	
	public void treat(Patient patient,String prescription) {
		
		patient.getMedicalRecord().addPrescription(prescription);
	}

}
