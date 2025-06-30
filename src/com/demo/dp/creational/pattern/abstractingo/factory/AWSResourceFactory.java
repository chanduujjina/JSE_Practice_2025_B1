package com.demo.dp.creational.pattern.abstractingo.factory;

public class AWSResourceFactory implements CloudResourceFactory{

	@Override
	public ComputeInstance getComputeInstance() {
		return new AWSComputeInstance();
	}

	@Override
	public StorageBucket getStorageBucket() {
		return new AWSStorageBucket();
	}

}
