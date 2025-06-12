package com.demo.oops.has.relation.rt;

public class Patient {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}


	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	private String name;
	
	private MedicalRecord medicalRecord;
	
	public Patient(String name,String diagnosis) {
		medicalRecord = new MedicalRecord(diagnosis);
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Patient [name=" + name + ", medicalRecord=" + medicalRecord + "]";
	}

}
