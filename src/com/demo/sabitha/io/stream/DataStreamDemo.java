package com.demo.sabitha.io.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {
	public static void main(String[] args) {
		String filepath="sabitha/datafile.dat";
		DataWriter(filepath);
		DataReader(filepath);
	}
	private static void DataReader(String filepath) {
		try(DataInputStream dataInputStream=new DataInputStream(new FileInputStream(filepath))) {
			DataStreamDemo dataStreamDemo=new DataStreamDemo(dataInputStream.readInt(), dataInputStream.readUTF(),dataInputStream.readLong(), dataInputStream.readDouble(),dataInputStream.readUTF(),dataInputStream.readUTF());
			System.out.println(dataStreamDemo.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private int Emp_id;
	private String Emp_name;
	private long  Emp_Number;
	private double Emp_Salary;
	private String Emp_Company;
	private String Emp_Gender;
	
	public int getEmp_id() {
		return Emp_id;
	}
	
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	
	public String getEmp_name() {
		return Emp_name;
	}
	
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	
	public long getEmp_Number() {
		return Emp_Number;
	}
	
	public void setEmp_Number(long emp_Number) {
		Emp_Number = emp_Number;
	}
	
	public double getEmp_Salary() {
		return Emp_Salary;
	}
	
	public void setEmp_Salary(double emp_Salary) {
		Emp_Salary = emp_Salary;
	}
	
	public String getEmp_Company() {
		return Emp_Company;
	}
	
	public void setEmp_Company(String emp_Company) {
		Emp_Company = emp_Company;
	}
	
	public String getEmp_Gender() {
		return Emp_Gender;
	}
	
	@Override
	public String toString() {
		return "DataStreamDemo [Emp_id=" + Emp_id + ", Emp_name=" + Emp_name + ", Emp_Number=" + Emp_Number
				+ ", Emp_Salary=" + Emp_Salary + ", Emp_Company=" + Emp_Company + ", Emp_Gender=" + Emp_Gender + "]";
	}

	public DataStreamDemo(int emp_id, String emp_name, long emp_Number, double emp_Salary, String emp_Company,
			String emp_Gender) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		Emp_Number = emp_Number;
		Emp_Salary = emp_Salary;
		Emp_Company = emp_Company;
		Emp_Gender = emp_Gender;
	}

	public void setEmp_Gender(String emp_Gender) {
		Emp_Gender = emp_Gender;
	}
private static void DataWriter(String filepath) {
		try(DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(filepath))) {
			dataOutputStream.writeInt(1);
			dataOutputStream.writeUTF("sabitha");
			dataOutputStream.writeLong(12345679);
			dataOutputStream.writeDouble(3000000.00);
			dataOutputStream.writeUTF("google");
			dataOutputStream.writeUTF("Female");
			System.out.println("success");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
