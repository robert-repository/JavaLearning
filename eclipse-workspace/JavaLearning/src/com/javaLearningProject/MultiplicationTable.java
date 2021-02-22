package com.javaLearningProject;

public class MultiplicationTable {

	void printMultiplicationTable(int number) {
		printMultiplicationTable(number, 1, 10);
	}

	void printMultiplicationTable(int number, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.println(number + " * " + i + " = " + number * i);
		}
	}

}
