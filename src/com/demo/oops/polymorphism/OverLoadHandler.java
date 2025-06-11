package com.demo.oops.polymorphism;

public class OverLoadHandler {
	
   public Integer covertDataType(String value) {
	   return Integer.parseInt(value);
   }
   
   public String covertDataType(Integer number) {
	   return String.valueOf(number);
   }
   
   public String covertDataType(Long number) {
	   return String.valueOf(number);
   }
   
   public String covertDataType(Double number) {
	   return String.valueOf(number);
   }

}
