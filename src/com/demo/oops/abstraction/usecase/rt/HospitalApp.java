package com.demo.oops.abstraction.usecase.rt;

import java.util.ArrayList;
import java.util.List;

// Aggregation: Hospital has Departments
class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class Hospital {
    String name;
    List<Department> departments = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void listDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department d : departments) {
            System.out.println("- " + d.name);
        }
    }
}

// Composition: Patient has a MedicalRecord (record cannot exist without patient)
class MedicalRecord {
    String diagnosis;
    List<String> prescriptions = new ArrayList<>();

    MedicalRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    void addPrescription(String medicine) {
        prescriptions.add(medicine);
    }

    void printRecord() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Prescriptions: " + prescriptions);
    }
}

class Patient {
    String name;
    MedicalRecord record;

    Patient(String name, String diagnosis) {
        this.name = name;
        this.record = new MedicalRecord(diagnosis); // Composition
    }

    void showRecord() {
        System.out.println("Patient: " + name);
        record.printRecord();
    }
}

// Association: Doctor treats Patient
class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void treat(Patient p) {
        System.out.println("Dr. " + name + " is treating " + p.name);
        p.record.addPrescription("Paracetamol");
    }
}

// Main Class
public class HospitalApp {
    public static void main(String[] args) {
        // Aggregation
        Hospital h = new Hospital("City Hospital");
        h.addDepartment(new Department("Cardiology"));
        h.addDepartment(new Department("Neurology"));
        h.listDepartments();

        // Composition & Association
        Patient p1 = new Patient("Alice", "Migraine");
        Doctor d1 = new Doctor("Dr. Smith");

        d1.treat(p1); // Association
        p1.showRecord(); // Composition
    }
}
