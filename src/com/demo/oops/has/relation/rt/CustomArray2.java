package com.demo.oops.has.relation.rt;

public class CustomArray2 {
	
private Department departmentArray [];
	
	int count =0;
	
	public CustomArray2() {
		departmentArray = new Department[1];
	}
	
	
	public void add(Department Department) {
		
		//search for index 0 to accomadate element
		if (departmentArray [0] == null) {
			departmentArray[0] =Department;
		}
		else {
			
			//create a new array by increment 1 with old array size
			Department newDepartmentArray [] = new Department[departmentArray.length+1];
			
			//copy the elements from old to new Array
			
			System.arraycopy(departmentArray, 0, newDepartmentArray, 0, departmentArray.length);
			newDepartmentArray[count] = Department;
			
			departmentArray = newDepartmentArray;
			
		}
		count++;
	}
	
	public Department [] getArrayData() {
		return this.departmentArray;
	}
	
	public Department findIndexOf(int index) {
		return departmentArray[index];
	}

}
