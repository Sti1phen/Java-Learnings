//Question 2.16
//Comparing a number and its Square with the number 100.

import java.util.Scanner; //Import object Scanner to read input from user

public class ComparingInteger
{

	public static void main (String[] args)
	{
		
		Scanner input = new Scanner(System.in); //allows user to input from keyboard
		
		int n; //integer from user
		int s; //number squared
		
		System.out.print("Enter a number: ");
		n = input.nextInt(); //read the input and converts to integer
		
		s = n*n;
		
		if (n == 100)
		System.out.println("Your number is equal to 100");
		
		if (n > 100)
		System.out.println("Your number is greater than 100");
			
		if (n < 100)
		System.out.println("Your number is less than 100");
		
		if (n != 100)
		System.out.println("Your number is not equal to 100");
		
		if (s == 100)
		System.out.print("The square of your number is equal to 100");
		
		if (s > 100)
		System.out.println("The square of your number is greater than 100");
		
		if (s < 100)
		System.out.println("The square of your number is less than 100");
		
		if (s != 100)
		System.out.println("The square of your number is not equal to 100");
		
		}
}
