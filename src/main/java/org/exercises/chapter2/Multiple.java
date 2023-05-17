package main.java.org.exercises.chapter2;
//Question 2.26
//An application that reads two integers and tells whether the first number tripled is a multiple of the secnd number doubled and prints the result.

import java.util.Scanner;

public class Multiple {
	public static void main (String [] args) {
		int a, b, c, d;	//two integers, first tripled and second doubled
		
		Scanner input = new Scanner(System.in);	//Allows the app to receive input (integers) from the input device i.e. Keyboard
		
		System.out.print("Enter the first integer: ");
		a = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		b = input.nextInt();
		
		c = 3 * a;
		
		d = 2 *b;
		
		if (c % d == 0)
		System.out.printf("%d tripled is a multiple of %d doubled\n", a, b);
		
		if (c % d != 0)
		System.out.printf("%d tripled is not a multiple of %d doubled\n", a, b);
		}
	}

		
		
		
		
