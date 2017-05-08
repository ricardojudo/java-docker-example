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
			return;
		}

		String operation = args[0];

		int op1 = Integer.parseInt(args[1]);
		int op2 = 0;
		if (args.length == 3) {
			op2 = Integer.parseInt(args[2]);
		}

		Calculator calculator = new Calculator();

		switch (operation) {
		case "add":
			System.out.println(">> " + calculator.add(op1, op2));
			break;
		case "sub":
			System.out.println(">> " + calculator.sub(op1, op2));
			break;
		case "abs":
			System.out.println(">> " + calculator.abs(op1));
			break;
		default:
			System.out.println("Not supported operation: add sub abs");
			break;
		}

	}
}
