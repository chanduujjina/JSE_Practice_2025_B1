package com.demo.dp.creational.pattern.abstractingo.factory;

public class CloudResourceProviderFactory {

	public static void main(String[] args) {
		// request 1
		CloudResourceFactory cloudResourceFactory1 = CloudResourceProviderFactory.getCloudResourceFactory("AWS");

		// service 1
		ComputeInstance computeInstance1 = cloudResourceFactory1.getComputeInstance();
		computeInstance1.start();

		// service 2
		StorageBucket storageBucket1 = cloudResourceFactory1.getStorageBucket();
		storageBucket1.storeData("this my first data going store in cloud");

		// request 2
		CloudResourceFactory cloudResourceFactory2 = CloudResourceProviderFactory.getCloudResourceFactory("GCP");

		// service 1
		ComputeInstance computeInstance2 = cloudResourceFactory2.getComputeInstance();
		computeInstance2.start();

		// service 2
		StorageBucket storageBucket2 = cloudResourceFactory2.getStorageBucket();
		storageBucket2.storeData("this my first data going store in cloud");

		// request 3
		CloudResourceFactory cloudResourceFactory3 = CloudResourceProviderFactory.getCloudResourceFactory("Azure");

		// service 1
		ComputeInstance computeInstance3 = cloudResourceFactory3.getComputeInstance();
		computeInstance3.start();

		// service 2
		StorageBucket storageBucket3 = cloudResourceFactory3.getStorageBucket();
		storageBucket3.storeData("this my first data going store in cloud");
	}

	public static CloudResourceFactory getCloudResourceFactory(String type) {
		switch (type) {
		case "AWS":
			return new AWSResourceFactory();
		case "GCP":
			return new GCPCloudResorcesFactory();

		case "Azure":
			return new AzureCloudRessourceFactory();

		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}

}
