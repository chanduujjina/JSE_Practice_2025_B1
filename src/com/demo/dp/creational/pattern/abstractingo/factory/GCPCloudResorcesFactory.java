package com.demo.dp.creational.pattern.abstractingo.factory;

public class GCPCloudResorcesFactory implements CloudResourceFactory{

	@Override
	public ComputeInstance getComputeInstance() {
		
		return new GCPComputeInstance();
	}

	@Override
	public StorageBucket getStorageBucket() {
		return new GCPStorageBucket();
	}

}
