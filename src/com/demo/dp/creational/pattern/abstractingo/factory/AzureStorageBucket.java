package com.demo.dp.creational.pattern.abstractingo.factory;

public class AzureStorageBucket implements StorageBucket{

	@Override
	public void storeData(String data) {
		System.out.println("Date stoted azure cloud bucket "+data);
		
	}

}
