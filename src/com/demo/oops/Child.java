package com.demo.oops;

public class Child  extends Parent {
	
	
    private String childType;
	
	private int childId;

	
	 //public com.demo.oops.Child();
	
	/*
	 *  public Child(){
	 *    super();
	 *  }
	 * 
	 */
	
	//No Arg contrctor
	/*
	 * public Child() { super("parent",1); }
	 */
	
	public Child(String type,int id,String childType,int childId) {
		super(type,id);//it will call super class constrctor
		this.childId = childId;
		this.childType =childType;
		
	}


	public String getChildType() {
		return childType;
	}


	public void setChildType(String childType) {
		this.childType = childType;
	}


	public int getChildId() {
		return childId;
	}


	public void setChildId(int childId) {
		this.childId = childId;
	}


	@Override
	public String toString() {
		return "Child [childType=" + childType + ", childId=" + childId + "]";
	}
}
