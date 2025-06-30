package com.demo.dp.creational.pattern.abstractingo.factory;

public class AzureComputeInstance implements ComputeInstance{

	@Override
	public void start() {
		System.out.println("Azure VM is started");
		
	}

}
