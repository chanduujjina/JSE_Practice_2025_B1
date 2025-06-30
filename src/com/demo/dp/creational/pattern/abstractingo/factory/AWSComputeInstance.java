package com.demo.dp.creational.pattern.abstractingo.factory;

public class AWSComputeInstance implements ComputeInstance{

	@Override
	public void start() {
		System.out.println("AWS Ec2 machine started");
		
	}

}
