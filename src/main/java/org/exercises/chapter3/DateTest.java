package main.java.org.exercises.chapter3;
//Question 3.14
//DateTest app

import java.util.Scanner;

public class DateTest {

	public static void main (String [] args) {
		Date dob = new Date(3,14, 1993);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your year of birth: \n");
		int year = input.nextInt();
		dob.setYear(year);
		
		System.out.printf("Enter the month number you were born in year %d\n", dob.getYear());
		int month = input.nextInt();
		dob.setMonth(month);
		
		System.out.printf("What day in month %d were you born?\n", dob.getMonth());
		int day = input.nextInt();
		dob.setDay(day);
		
		System.out.println("Your date of birth is:");
		
		dob.displayDate();
		
	}
	
}
		
		 
		
