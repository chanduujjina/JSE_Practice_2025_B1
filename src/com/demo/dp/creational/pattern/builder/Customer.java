package com.demo.dp.creational.pattern.builder;

public class Customer {

	private final int customerId;

	private final String customerName;

	private final String gender;

	private final String email;

	private final String phoneNumber;

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	

	public Customer(Builder builder) {
     this.customerId = builder.customerId;
     this.customerName = builder.customerName;
     this.gender = builder.gender;
     this.email = builder.email;
     this.phoneNumber = builder.phoneNumber;
    		 
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

	public static class Builder {
		private final int customerId;

		private final String customerName;

		private String gender;

		private String email;

		private String phoneNumber;

		public Builder(int customerId, String customerName) {
			this.customerId = customerId;
			this.customerName = customerName;
		}
		
		public Builder gender(String gender) {
			this.gender = gender;
			return this;
					
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
					
		}
		
		public Builder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
					
		}
		
		public Customer build() {
			return new Customer(this);
		}

	}

}
