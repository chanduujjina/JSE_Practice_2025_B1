package com.demo.exception.sabitha.handler;



public class StudentHandler {
	public static void main(String[] args) {
		StudentHandler student=new StudentHandler();
		student.addStudent(new Student("214","sabitha","female","16/05/2001","SP254668A"));
		
		
	}
	
	public void addStudent(Student student) {
		String resposne = null;
		try {
			resposne = validateStudentData(student);
		} catch (StudentValidationException e) {
			System.out.println(e.getMessage());
			resposne = "failed";
		}
		System.out.println(resposne);
		//if vaidation is success then to customerInfos array
		
	}
private String validateStudentData(Student student) throws StudentValidationException{
		
		validateRequiredFields(student);//if validation fails hard stop
		
		StudentErrorArray validateData = validateData(student);
		
		
		if (validateData.getArrayData().length > 1) {
			
			
			StringBuilder messageBuilder = new StringBuilder();
			for (ErrorDetails details : validateData.getArrayData()) {
				messageBuilder.append(details.getErrorDescription());
				messageBuilder.append(", ");
			}
			
			throw new StudentValidationException(messageBuilder.toString());
		}
		
		return "Success";
     
	}
	private StudentErrorArray validateData(Student student) {
		StudentErrorArray studentErrorArray =  new StudentErrorArray();
		
		if (!student.getStd_Id().matches("\\d+")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("custid");
			errDetails.setErrorDescription("customer id must be a positive number");
			studentErrorArray.add(errDetails);
			
		}
		
		 if (!student.getStd_Name().matches("^[a-zA-Z]+$")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("custName");
			errDetails.setErrorDescription("customer name must be a alphabetical");
			studentErrorArray.add(errDetails);
		}
		
		 if (!student.getStd_PAN().matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("Pan");
			errDetails.setErrorDescription("Pan name must be a start A To Z next there should be 4 digit number end leter must be capital letter");
			studentErrorArray.add(errDetails);
		}
		
		 if (!student.getStd_Gender().matches("^[Female][Male]$")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("gender");
			errDetails.setErrorDescription("aaadhar first leter must be number from 2 to 9 then 11 number fiorm 0 to 9");
			studentErrorArray.add(errDetails);
		}
		
		
		
		 if (!student.getStd_Dob().matches("^(0[1-9]|1[0-9]|2[0-9]|3[0-1])/(0[1-9]|1[0-2])/(19|20)\\d{2}+$")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("phoneNumber");
			errDetails.setErrorDescription("phoneNumer first leter  from 6 to 9 then 9 numbes fro 0 to 9");
			studentErrorArray.add(errDetails);
		}
		
		return studentErrorArray;
		
	}

	private void validateRequiredFields(Student student) throws StudentValidationException {
		boolean isvalidationSuccess = true;
		String inputFieldName = null;
		
		if (isValidate(student.getStd_Id())) {
			isvalidationSuccess = false;
			inputFieldName ="id";
			//throw new CustomerValidationException("id must not me empty");
		}
		else if (isValidate(student.getStd_Name())) {
			inputFieldName ="name";
			isvalidationSuccess = false;
			//throw new CustomerValidationException("name must not me empty");
		}
		
      else if (isValidate(student.getStd_Gender())) {
    	  inputFieldName ="Gender";
    	  isvalidationSuccess = false;
    	  //throw new CustomerValidationException("addhar must not me empty");
		}
		
      else if (isValidate(student.getStd_Dob())) {
    	  inputFieldName ="DateOfBirth";
    	  isvalidationSuccess = false;
    	  //throw new CustomerValidationException("pan must not me empty");
		}
		
      else if (isValidate(student.getStd_PAN())) {
    	    inputFieldName ="PAN";
    	  isvalidationSuccess = false;
    	  //throw new CustomerValidationException("phone must not me empty");
		}
		
		
		if (!isvalidationSuccess) {
			throw new StudentValidationException(inputFieldName+" must not me empty");
		}
	}
	
	
	public boolean isValidate(String value) {
			return value==null||value.equals(" ");
		
	}

}
