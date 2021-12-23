package Factorial;

import java.util.Scanner;

public class CalculateFactorial {
	public static int factorial(int n) {
		if (n== 0) 
		{
			return (1);
		}
		else {
			return (n* factorial(n-1)); // * is a delay operator use accumative recursion
		}
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int n = reader.nextInt();
		
		System.out.println(" The factorial of "+ n + " is " + factorial(n));
		

	}

}
