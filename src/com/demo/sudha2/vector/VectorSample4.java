package com.demo.sudha2.vector;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class VectorSample4 {
	public static void main(String[] args) {
		Vector<String> Sudha = new Vector<>(30);
		addElements(Sudha);
		SubListMethod(Sudha);

	}

	private static void SubListMethod(Vector<String> Sudha) {
		int threshhold = Integer.parseInt("8");
		int Start = Integer.parseInt("1");
		int End = threshhold;
		int noOfSublist = Sudha.size() / threshhold;
		for (int i = 0; i < noOfSublist; i++) {
			List<String> list = Sudha.subList(Start, End);
			System.out.println(list);
			Start = End;
			End = End + threshhold;
		}
		int reminder = Sudha.size() % threshhold;
		if (reminder > 0) {
			List<String> list1 = Sudha.subList(Start, Sudha.size());
			System.out.println(list1);
		}

	}

	private static void addElements(Vector<String> sudha) {
		for (int i = 0; i < sudha.capacity(); i++) {
			sudha.add(String.valueOf(i));
		}
	}

}
