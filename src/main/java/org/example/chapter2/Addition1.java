//QUESTION 6
//This program calculates the total mark obtained in three tests

import java.util.Scanner;

public class Addition1
{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int t1, t2, t3, total;

		System.out.print("Enter the mark in the first test: ");

		t1 = input.nextInt();

		System.out.print("Enter the mark in the second test: ");

		t2 = input.nextInt();

		System.out.print("Enter the mark in the third test: ");

		t3 = input.nextInt();

		total = t1 + t2 + t3;

		System.out.printf("Total marks: %d\n", total);
		}
	}

