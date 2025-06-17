package com.demo.exception.handler;

public class CustomErrorArray {
	
private ErrorDetails errorDetailArray [];
	
	int count =0;
	
	public CustomErrorArray() {
		errorDetailArray = new ErrorDetails[1];
	}
	
	
	public void add(ErrorDetails ErrorDetails) {
		
		//search for index 0 to accomadate element
		if (errorDetailArray [0] == null) {
			errorDetailArray[0] =ErrorDetails;
		}
		else {
			
			//create a new array by increment 1 with old array size
			ErrorDetails newErrorDetailArray [] = new ErrorDetails[errorDetailArray.length+1];
			
			//copy the elements from old to new Array
			
			System.arraycopy(errorDetailArray, 0, newErrorDetailArray, 0, errorDetailArray.length);
			newErrorDetailArray[count] = ErrorDetails;
			
			errorDetailArray = newErrorDetailArray;
			
		}
		count++;
	}
	
	public ErrorDetails [] getArrayData() {
		return this.errorDetailArray;
	}
	
	public ErrorDetails findIndexOf(int index) {
		return errorDetailArray[index];
	}

}