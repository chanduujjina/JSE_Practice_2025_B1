package com.demo.assignment.sudha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

  public class AnagramsProgram {
	public static void main(String[] args) {
		
		String[] input = { "eat", "bat", "tea", "tab", "ate" };

	
		HashMap<String, ArrayList<String>> map = new HashMap<>();

		for (String word : input) {

			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);

			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}

			map.get(sorted).add(word);
		}

		for (ArrayList<String> group : map.values()) {
			System.out.println(group);
		}

	}
}