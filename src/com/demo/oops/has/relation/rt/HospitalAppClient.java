package com.demo.oops.has.relation.rt;

public class HospitalAppClient {
	
	public static void main(String[] args) {
		
		Department department1 = new Department("Cardio");
		Department department2 = new Department("Ortho");
		Department department3 = new Department("Nephro");
		Department department4 = new Department("Derm");
		
		Hospital hospital = new Hospital("Test Hospital");
		hospital.addDepartment(department1);
		hospital.addDepartment(department2);
		hospital.addDepartment(department3);
		hospital.addDepartment(department4);
		
		Patient patient = new Patient("Test Patient", "Ortho");
		
		Doctor doctor = new Doctor("Test Doctor");
		
		doctor.treat(patient,"Medicine,labs");
		
		System.out.println(patient);
		
		Department[] listDepartments = hospital.listDepartments();
		
		for (Department departMent : listDepartments) {
			System.out.println(departMent);
		}
		
		
		
	}

}
