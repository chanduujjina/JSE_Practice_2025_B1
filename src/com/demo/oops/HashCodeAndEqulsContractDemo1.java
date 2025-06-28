package com.demo.oops;

public class HashCodeAndEqulsContractDemo1 {
	
	public static void main(String[] args) {
		
		ProviderInfo providerInfo1 = new ProviderInfo(1, "test");
		ProviderInfo providerInfo2 = new ProviderInfo(1, "test");
		
		System.out.println("providerInfo1 hashcode::"+providerInfo1.hashCode());
		System.out.println("providerInfo2 hashcode::"+providerInfo2.hashCode());
		
		System.out.println("equls method:"+providerInfo1.equals(providerInfo2));
	}

}
