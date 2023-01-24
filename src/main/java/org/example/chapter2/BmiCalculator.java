package org.example.chapter2;
//Question 2.33
//This app calculates the BMI of its user.

import java.util.Scanner;

public class BmiCalculator
{

	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in); // Allows user input from System input (Keyboard)
		
		double w, h, B;//declaring weight and height variables in kg
		
		System.out.print("Enter your weight in kg: ");
		
		w = input.nextDouble();
		
		System.out.print("Enter your height in meters: ");
		
		h = input.nextDouble();
		
		B = w / (h * h);
		
		System.out.printf("\nYour BMI value is %.2f\n", B);
		
		System.out.print("\nPlease see below to evalulate your BMI\n\nBMI VALUES (according to Department of Health and Human Services)\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater\n");
		
		}
	
	}

		
