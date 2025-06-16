package com.demo.exception.handler;

public class CustomerHandler {
	
	
	
	public static void main(String[] args) {
		CustomerHandler customerHandler = new CustomerHandler();
		
		//request 1
		customerHandler.addCustomer(new CustomerInfo(null,null,null,null,null));
		
		//request 2
		customerHandler.addCustomer(new CustomerInfo("test","test","test","test","test"));
		
		//request 3
		customerHandler.addCustomer(new CustomerInfo("1","chandu","9573532532","AEWPU4902R","212345678912"));
	}
	
	
	
	public void addCustomer(CustomerInfo customerInfo) {
		String resposne = null;
		try {
			resposne = validateCustomerData(customerInfo);
		} catch (CustomerValidationException e) {
			System.out.println(e.getMessage());
			resposne = "failed";
		}
		System.out.println(resposne);
		//if vaidation is success then to customerInfos array
		
	}

	private String validateCustomerData(CustomerInfo customerInfo) throws CustomerValidationException{
		
		validateRequiredFields(customerInfo);//if validation fails hard stop
		
		CustomErrorArray validateData = validateData(customerInfo);
		
		
		if (validateData.getArrayData().length > 1) {
			
			
			StringBuilder messageBuilder = new StringBuilder();
			for (ErrorDetails details : validateData.getArrayData()) {
				messageBuilder.append(details.getErrorDescription());
				messageBuilder.append(", ");
			}
			
			throw new CustomerValidationException(messageBuilder.toString());
		}
		
		return "Success";
     
	}



	private CustomErrorArray validateData(CustomerInfo customerInfo) {
		CustomErrorArray customErrorArray =  new CustomErrorArray();
		
		if (!customerInfo.getCustId().matches("\\d+")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("custid");
			errDetails.setErrorDescription("customer id must be a positive number");
			customErrorArray.add(errDetails);
			
		}
		
		 if (!customerInfo.getCustName().matches("^[a-zA-Z]+$")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("custName");
			errDetails.setErrorDescription("customer name must be a alphabetical");
			customErrorArray.add(errDetails);
		}
		
		 if (!customerInfo.getPanNumber().matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("Pan");
			errDetails.setErrorDescription("Pan name must be a start A To Z next there should be 4 digit number end leter must be capital letter");
			customErrorArray.add(errDetails);
		}
		
		 if (!customerInfo.getAadharNumber().matches("^[2-9][0-9]{11}$")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("aadhar");
			errDetails.setErrorDescription("aaadhar first leter must be number from 2 to 9 then 11 number fiorm 0 to 9");
			customErrorArray.add(errDetails);
		}
		
		
		
		 if (customerInfo.getPhoneNumber().matches("^[6-9][1][0-9][9]$")) {
			ErrorDetails errDetails = new ErrorDetails();
			errDetails.setErrorId("phoneNumber");
			errDetails.setErrorDescription("phoneNumer first leter  from 6 to 9 then 9 numbes fro 0 to 9");
			customErrorArray.add(errDetails);
		}
		
		return customErrorArray;
		
	}



	private void validateRequiredFields(CustomerInfo customerInfo) throws CustomerValidationException {
		boolean isvalidationSuccess = true;
		String inputFieldName = null;
		
		if (isValidData(customerInfo.getCustId())) {
			isvalidationSuccess = false;
			inputFieldName ="id";
			//throw new CustomerValidationException("id must not me empty");
		}
		else if (isValidData(customerInfo.getCustName())) {
			inputFieldName ="name";
			isvalidationSuccess = false;
			//throw new CustomerValidationException("name must not me empty");
		}
		
      else if (isValidData(customerInfo.getAadharNumber())) {
    	  inputFieldName ="aadhar";
    	  isvalidationSuccess = false;
    	  //throw new CustomerValidationException("addhar must not me empty");
		}
		
      else if (isValidData(customerInfo.getPanNumber())) {
    	  inputFieldName ="pan";
    	  isvalidationSuccess = false;
    	  //throw new CustomerValidationException("pan must not me empty");
		}
		
      else if (isValidData(customerInfo.getPhoneNumber())) {
    	    inputFieldName ="phone";
    	  isvalidationSuccess = false;
    	  //throw new CustomerValidationException("phone must not me empty");
		}
		
		
		if (!isvalidationSuccess) {
			throw new CustomerValidationException(inputFieldName+" must not me empty");
		}
	}
	
	private boolean isValidData(String value) {
		return (null == value || value.equals(""));
	}

}
