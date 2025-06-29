package com.demo.collection.set;

import java.util.HashSet;

public class HashSetDemo3 {
	
	public static void main(String[] args) {
		
		HashSet<Sample> sampleSet = new HashSet<>();
		sampleSet.add(new Sample(1, "blood"));
		sampleSet.add(new Sample(2, "Urine"));
		sampleSet.add(new Sample(3, "Serum"));
		sampleSet.add(new Sample(3, "Serum"));
		
		System.out.println(sampleSet);
		
	}

}
