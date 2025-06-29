package com.demo.dp.creational.pattern.abstractingo.factory;

public class AWSStorageBucket implements StorageBucket{

	@Override
	public void storeData(String data) {
		System.out.println("data stored in s3 bucket "+data);
		
	}

}
