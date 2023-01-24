//Question 2.15
/**Prompt User for two Integer and Calculate their squares and  the addition and difference of their squares*/

import java.util.Scanner; 	//Import class Scanner to e able to read input from user

public class Arithmetic
{
	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in); //Allows the user 	to input from System input mainly keyboard
		
		int n1;	//first integer
		int n2; // second integer
		int s1;	// square of first integer
		int s2; // square of second integer
		int ss; // sum of the squares
		int ds; // difference of the squares
		
		System.out.print("Enter an integer: ");	//prompt user for first integer
		n1 = input.nextInt();
		
		System.out.print("Enter another integer: "); //propt user for second integer
		n2 = input.nextInt();
		
		s1 = n1*n1;
		
		s2 = n2*n2;
		
		ss = s1 + s2;
		
		ds = s1 - s2;
		
		System.out.printf("Square of first integer is %d\nSquare of second integer is %d\nSum of Squares is %d\nDifference of Squares is %d\n", s1, s2, ss, ds);
		}
	}
	
