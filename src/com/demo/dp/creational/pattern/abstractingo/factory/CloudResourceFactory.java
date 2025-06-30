package com.demo.dp.creational.pattern.abstractingo.factory;

//absttract facttory
public interface CloudResourceFactory {
	
	ComputeInstance getComputeInstance();//service 1
	
	StorageBucket getStorageBucket();//Service 2
	

}
