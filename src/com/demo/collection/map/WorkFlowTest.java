package com.demo.collection.map;

public class WorkFlowTest {

	public static void main(String[] args) {

		Integer key1 = 1;

		// Step 1

		// find the HashCode of key

		int hashCode = key1.hashCode();

		System.out.println(hashCode);

		// find the index by calling hash method

		int hash = hash(1, hashCode);
		System.out.println(hash);

		Integer key2 = 2;

		// Step 1

		// find the HashCode of key

		int hashCode1 = key2.hashCode();

		System.out.println(hashCode1);

		// find the index by calling hash method

		int hash1 = hash(1, hashCode1);
		System.out.println(hash1);

	}

	static final int hash(Object key, int hashCode) {
		int h;
		return (key == null) ? 0 : (h = hashCode) ^ (h >>> 16);
	}

}
