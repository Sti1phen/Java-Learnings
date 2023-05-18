package main.java.org.projects.chapter2;
//Question 2.30
//This app separates the digits of a five (5) digits integer and prints them

import java.util.Scanner;

public class IndividualDigit {
	public static void main (String [] args) {
Scanner input = new Scanner (System.in);

		int x;

	System.out.print("Enter a five (5) digit number: ");
		x = input.nextInt();


		if (x >= 10000 && x <= 99999)	//a five digits number must be entered

			{System.out.printf("%d   ", (x / 10000));
			System.out.printf("%d   ", ((x / 1000) % 10));
			System.out.printf("%d   ", ((x / 100) % 10));
			System.out.printf("%d   ", ((x % 100) / 10));
			System.out.printf("%d   \n", (x % 10));}

		if (x < 10000) //Reject a number below five digits

			System.out.println("You entered a number below 5 digits");

		if (x > 99999) //Reject a number more than five digits

			System.out.println("You entered a number more than 5 digits");


			}
		
		}
