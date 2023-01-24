//Question 2.17
//Calculation of sum, average, smallest and largest of 3 integers

import java.util.Scanner;

public class Arithmetic2
{
	
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner (System.in);
		
		int x, y, z; //three integers
		
		int total; // sum of 3 integers
		
		int average; //average of the 3 integers
		
		int product; //product ofthe 3integers
		
		System.out.print("Enter the first integer: ");
		
		x = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		z = input.nextInt();
		
		total = x + y + z;
		System.out.printf("Sum of integers is %d\n", total);
		
		average = (x + y + z)/3;
		System.out.printf("Average of integers is %d\n", average);
		
		product = x*y*z;
		System.out.printf("Product of integers is %d\n", product);
		
		
		if (x < y && x < z)
		System.out.printf("The smallest number is %d\n", x);
		
		if (y < x && y < z)
		System.out.printf("The smallest number is %d\n", y);
		
		if (z < x && z < y)
		System.out.printf("The smallest number is %d\n", z);
		
		if (x > y && x > z)
		System.out.printf("The largest number is %d\n", x);
		
		if (y > x && y > z)
		System.out.printf("The largest number is %d\n", y);
		
		if (z > x && z > y)
		System.out.printf("The largest number is %d\n", z);
		
		}
	}
		
