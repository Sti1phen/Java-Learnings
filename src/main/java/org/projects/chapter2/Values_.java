package main.java.org.projects.chapter2;
//Question 2.32
//An app that gives the number of negative, positive abd zero inputs

import java.util.Scanner;

public class Values_ {

	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y, z, a, b, c = 0, d = 0, e = 0;
		// c is +ve number count
		//d is -ve number count
		//e is 0s number count
		
		System.out.print("Enter the first integer: ");

		x = input.nextInt();
	
		System.out.print("Enter the second integer: ");

		y = input.nextInt();		
		
		System.out.print("Enter the third integer: ");

		z = input.nextInt();
		
		System.out.print("Enter the fourth integer: ");

		a = input.nextInt();
		
		System.out.print("Enter the fifth integer: ");

		b = input.nextInt();
		
		//Positive number count
		if (x > 0)
		c = c + 1;
		
		if (y > 0)
		c = c + 1;
		
		if (z > 0)
		c = c + 1;
		
		if (a > 0)
		c = c + 1;
		
		if (b > 0)
		c = c + 1;
		
		//Negative number count
		if (x < 0)
		d = d + 1;
		
		if (y < 0)
		d = d + 1;
		
		if (z < 0)
		d = d + 1;
		
		if (a < 0)
		d = d + 1;
		
		if (b < 0)
		d = d + 1;
		
		//Zero number count
		if (x == 0)
		e = e + 1;
		
		if (y == 0)
		e = e + 1;
		
		if (z == 0)
		e = e + 1;
		
		if (a == 0)
		e = e + 1;
		
		if (b == 0)
		e = e + 1;

		System.out.printf("Number of Negative input(s) is %d\n", d);
		System.out.printf("Number of Positive input(s) is %d\n", c);
		System.out.printf("Number of Zero(s) input is %d\n", e);
		}
	}	


