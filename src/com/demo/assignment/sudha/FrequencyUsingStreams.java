package com.demo.assignment.sudha;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyUsingStreams {
	public static void main(String[] args) {
		String input="JavaProgramming";

        Map<Character, Long> frequencyMap = input.chars()   .mapToObj(c -> Character.toLowerCase((char) c))  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Frequency using Streams:");
        System.out.println(frequencyMap);
    }

	
	}


