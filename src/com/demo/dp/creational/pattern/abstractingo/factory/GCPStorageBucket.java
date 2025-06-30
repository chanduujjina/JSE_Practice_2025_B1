package com.demo.dp.creational.pattern.abstractingo.factory;

public class GCPStorageBucket implements StorageBucket{

	@Override
	public void storeData(String data) {
		System.out.println("data stored in GCS "+data);
		
	}

}
