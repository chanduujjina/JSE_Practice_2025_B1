package com.demo.rajasekhar.oops;

public class EnDemo3 {
	public static void main(String[] args) {
		
		Encap obj1 = new Encap();
		obj1.setid(14);
		obj1.setname("Raja");
		
		System.out.println(obj1.getid());
		System.out.println(obj1.getname());
		
	}

}

class Encap
{
	private int id;
	private String name;
	
	public void  setid(int id)
	{
		this.id = id;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	
	public int getid()
	{
		return id;
	}
	
	public String getname()
	{
		return name;
	}
	

}
