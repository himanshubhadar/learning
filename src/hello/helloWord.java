package hello;

import java.util.Scanner;

public class helloWord {
	public static void main(String[] args) {
	//	System.out.println("Hello, World!");
Scanner scanner = new Scanner(System.in);

// Taking first number input
System.out.print("Enter first number: ");
int num1 = scanner.nextInt();

// Taking second number input
System.out.print("Enter second number:");
int num2 = scanner.nextInt();

// Adding the numbers
int sum = num1 + num2;

// Displaying the result
System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

scanner.close();
	}
}
