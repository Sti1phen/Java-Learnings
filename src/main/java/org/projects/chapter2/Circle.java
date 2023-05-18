package main.java.org.projects.chapter2;
//Question 2.28
//Displaying Diameter, Circumference and Area of a Circle

import java.util.Scanner;

public class Circle {
	public static void main (String [] args) {
		int r, diameter, area;	// properties of the circle
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer radius of a circle: ");
		
		r = input.nextInt();
		
		System.out.printf("Diameter of the circle is %d\n", (2 * r));
		System.out.printf("Circumference of the circle is %f\n", (2 * Math.PI * r));
		
		System.out.printf("Area of the circle is %f\n", (Math.PI * r * r));
		}
	}
	
