package com.demo.collection.map;

public class WorkFlowTest2 {

	public static void main(String[] args) {

		String key1 = "test1";

		// Step 1

		// find the HashCode of key

		int hashCode = key1.hashCode();

		System.out.println("hashcode of key1 "+hashCode);//110251487

		// find the index by calling hash method

		int hash = hash(1, hashCode);//1110250829  -> 1
		System.out.println("index for key1  "+hash);

		String key2 = "test2";

		// Step 1

		// find the HashCode of key

		int hashCode1 = key2.hashCode();

		System.out.println("hashCode of key2 "+hashCode1);//110251488

		// find the index by calling hash method

		int hash1 = hash(1, hashCode1);
		System.out.println("index for key2 "+hash1);//110250866  -> 2

	}

	static final int hash(Object key, int hashCode) {
		int h;
		return (key == null) ? 0 : (h = hashCode) ^ (h >>> 16);
	}

}
