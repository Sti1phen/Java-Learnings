//Question 2.24
//An Application that reads five integers and tells the smallest and the largest of them
//The app will read integers, then give the smallest and the largest

import java.util.Scanner;

public class Comparison2
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);	//Allows user to input 5 integers from keyboard
		
		int a, b, c, d, e;	//five integers
		
		System.out.print("Enter the first integer: ");
		a = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		b = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		c = input.nextInt();
		
		System.out.print("Enter the fourth integer: ");
		d = input.nextInt();
		
		System.out.print("Enter the fifth integer: ");
		e = input.nextInt();
		
		if (a < b)
			{if (a < c)
				{if ( a < d)
					{if (a < e)
					System.out.printf("%d is the smallest number\n", a);
					}		
				}
			}
			
		if (b < a)
			{if (b < c)
				{if ( b < d)
					{if (b < e)
					System.out.printf("%d is the smallest number\n", b);
					}		
				}
			}
		
		if (c < a)
			{if (c < b)
				{if ( c < d)
					{if (c < e)
					System.out.printf("%d is the smallest number\n", c);
					}		
				}
			}
		
		if (d < a)
			{if (d < b)
				{if ( d < c)
					{if (d < e)
					System.out.printf("%d is the smallest number\n", d);
					}		
				}
			}	
	
		if (e < b)
			{if (e < c)
				{if ( e < d)
					{if (e < a)
					System.out.printf("%d is the smallest number\n", e);
					}		
				}
			}
		
	
		if (a > b)
			{if (a > c)
				{if ( a > d)
					{if (a > e)
					System.out.printf("%d is the largest number\n", a);
					}		
				}
			}			
		
		if (b > a)
			{if (b > c)
				{if ( b > d)
					{if (b > e)
					System.out.printf("%d is the largest number\n", b);
					}		
				}
			}
			
		if (c > a)
			{if (c > b)
				{if ( c > d)
					{if (c > e)
					System.out.printf("%d is the largest number\n", c);
					}		
				}
			}		
		
		if (d > a)
			{if (d > b)
				{if ( d > c)
					{if (d > e)
					System.out.printf("%d is the largest number\n", d);
					}		
				}
			}
	
		if (e > b)
			{if (e > c)
				{if ( e > d)
					{if (e > a)
					System.out.printf("%d is the largest number\n", e);
					}		
				}
			
			}		
		}
	}
