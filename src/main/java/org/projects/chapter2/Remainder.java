package main.java.org.projects.chapter2;
//Question 2.25
//This application reads an integer and tell whether it is divisible by 3 or not

import java.util.Scanner;

public class Remainder {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		int a;	//integer
		
		System.out.print("Enter an integer: ");
		a = input.nextInt();
		
		if (a % 3 == 0)
			System.out.printf("%d is divisible by 3\n", a);
		
		if (a % 3 != 0)
			System.out.printf("%d is not divisible by 3\n", a);
		
		}
	}
	
		
		
		
		
		
		


