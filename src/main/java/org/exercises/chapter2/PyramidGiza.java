package main.java.org.exercises.chapter2;
//Question 2.35
// An app that calculates an estimate weight of pyramid each year, hour, and minute

/*Estimated number of Stones is 2.3 million
Average weight of each stone is 2.5 tons
it took 100,000 men in 20 years to build the pyramids*/

import java.util.Scanner;
public class PyramidGiza {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		int S, w, y, T, Wy, Wh, Wm;
		
		System.out.println("The Great Pyramid of Giza");
		
		System.out.print("\nEnter the estimated number of stones used to build it: ");
		S = input.nextInt();
		
		System.out.print("Enter the average weight of each stone in kg: ");
		w = input.nextInt();
		
		System.out.print("Enter the number of years used to build the pyramid: ");
		y = input.nextInt();
		
		T = w * S;
		
		Wy = T / y;
		System.out.printf("Estimate weight of the pyramid built each year was %d\n", Wy);
		
		Wh = Wy / (365 * 24);
		System.out.printf("Estimate weight of the pyramid built each hour was %d\n", Wh);
		
		Wm = Wh / 60;
		System.out.printf("Estimate weight of the pyramid built each minute was %d\n", Wm);		
		
		}
	
	}
			
		

