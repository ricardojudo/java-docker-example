package com.example.calculator;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int abs(int a) {
		if (a >= 0) {
			return a;
		} else {
			return -1 * a;
		}
	}

	public static void main(String[] args) {

		if (args.length < 2) {
			System.out.println("Use: Calculator <operation> <param1> <param2>");
		}

		String operation = args[0];

		switch (operation) {
		case "add":

			break;
		case "sub":

			break;
		case "abs":

			break;

		default:
			break;
		}

	}
}
