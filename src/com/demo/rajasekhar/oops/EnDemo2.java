package com.demo.rajasekhar.oops;

public class EnDemo2 {
	public static void main(String[] args) {
		Student01 std = new Student01(1, "Rajasekhar", "C4", "Male");
		String name = std.getName();
		System.out.println(name);
		
	}
}

class Student01 {
	private int id;
	private String Name;
	private String Sec;
	private String Gender;

	public Student01(int id, String Name, String Sec, String Gender) {
		this.id = id;
		this.Name = Name;
		this.Sec = Sec;
		this.Gender = Gender;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSec() {
		return Sec;
	}
	public void setSec(String sec) {
		Sec = sec;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}
