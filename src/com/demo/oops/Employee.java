package com.demo.oops;

public class Employee {
	
	
	private int EmployeeId;
	
	private String name;
	
	private String gender;
	
	private Long phoneNumber;
	
	// setter and getter methods
	
	
	public void setEmployeeId (int EmployeeId) {
		
		this.EmployeeId = EmployeeId;
		
		
	}
	
        public void setName(String name) {
        	this.name = name;
        	
        }
        
        public void setGender(String gender) {
        	this.gender = gender;
        	
        }
        
        public void setPhoneNumber (Long phoneNumber) {
        	this.phoneNumber = phoneNumber;
        	
        }
        
        public int getEmployeeId() {
        	return this.EmployeeId;
        }
        
        public String getName() {
        	return this.name;
        }
        
        public String getGender() {
        	return this.gender;
        	
        }
        public Long phoneNumber() {
        	return this.phoneNumber;
        }

		public Long getPhoneNumber() {
		return this.phoneNumber;
		}
		@Override
		public String toString() {
			return "Employee [EmployeeId=" + EmployeeId + ", name=" + name + ", gender=" + gender + ", phoneNumber="
					+ phoneNumber + "]";
		}

}
