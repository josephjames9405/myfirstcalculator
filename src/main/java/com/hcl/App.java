package com.hcl;

import java.util.Scanner;

/**
 * Hello world! We need to build a calculator based Command line app where for
 * each operation, it should take 2 numbers and either add, substract, multiply
 * and divide, add
 * 
 * The based application involves prompting the user for 2 number and implement
 * only add
 * 
 * You have to have a menu driven application, where it show a banner and it
 * show "add, substract, multiply, divide" and if you select add or substract,
 * it should prompt for 2 number and the op and do the operation and show the
 * results and keep prompting the user with the same menu.
 * 
 * the 2 key requirement is it should have a basic banner and it should also be
 * menu driven
 */
public class App {
	public static void main(String[] args) {
		// Poor mans banner
		System.out.println("-------BASIC CALCULATOR------- ");

		// creates an object of Scanner
		Scanner input = new Scanner(System.in);
		char ch, choice;
		int p;

		/*
		 * System.out.print("Enter first number: ");
		 * 
		 * // takes 1st number int firstNumber = input.nextInt();
		 * 
		 * // prints the name System.out.println("Enter second number: ");
		 * 
		 * // takes 2st number int secondNumber = input.nextInt();
		 * 
		 * // operation add only int sum = firstNumber + secondNumber;
		 * 
		 * System.out.printf("Sum of %d and %d = %d", firstNumber, secondNumber, sum);
		 */
		do {
			System.out.print("OPERATIONS\n\n*:Multiplication\n/:Division\n+:Addition\n-:Subtraction");
			System.out.print("\nEnter your choice:");
			ch = input.next().charAt(0);
			System.out.print("Enter first number:");
			int firstNumber = input.nextInt();
			System.out.print("Enter second number:");
			int secondNumber = input.nextInt();

			switch (ch) {
			case '*':
				p = firstNumber * secondNumber;
				System.out.print("Product=" + p);
				break;
			case '/':
				p = firstNumber / secondNumber;
				System.out.print("Quotient=" + p);
				break;
			case '+':
				p = firstNumber + secondNumber;
				System.out.print("Sum=" + p);
				break;
			case '-':
				p = firstNumber - secondNumber;
				System.out.print("Difference=" + p);
				break;
			default:
				System.out.print("Invalid Entry");
				break;

			}
			System.out.print("\nDo you want to continue(y/n)=");
			choice = input.next().charAt(0);
			;
		} while (choice == 'y');

		// closes the scanner
		input.close();
	}
}
