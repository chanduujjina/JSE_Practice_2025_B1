package com.demo.sabitha.db.prototype;

public class Student implements Cloneable {
	private int Id;
	private String Name;
	private String Gender;
	private String PnoNmber;
	public Student(int id, String name, String gender, String pnoNmber) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		PnoNmber = pnoNmber;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public String getPnoNmber() {
		return PnoNmber;
	}
	public void setPnoNmber(String pnoNmber) {
		PnoNmber = pnoNmber;
	}
	@Override
	public Object  clone() throws CloneNotSupportedException{
		return  super.clone();
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", PnoNmber=" + PnoNmber + "]";
	}
	

}
