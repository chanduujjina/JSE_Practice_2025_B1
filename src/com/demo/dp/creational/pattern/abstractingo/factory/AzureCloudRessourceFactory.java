package com.demo.dp.creational.pattern.abstractingo.factory;

public class AzureCloudRessourceFactory implements CloudResourceFactory{

	@Override
	public ComputeInstance getComputeInstance() {
		// TODO Auto-generated method stub
		return new AzureComputeInstance();
	}

	@Override
	public StorageBucket getStorageBucket() {
		// TODO Auto-generated method stub
		return new AzureStorageBucket();
	}

}
