//Question 2.34
//An app that calculates the World Population Growth

import java.util.Scanner;

public class WorldGrowth
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		int C, Agr, f, s, t, fr,ff, yearlyincrease;
		
		System.out.print("Enter the current world population: ");
		C = input.nextInt();
		
		System.out.print("Enter the annual world population growth rate: ");
		Agr = input.nextInt();
		
		//Estimated world population calculation after 1 - 5 years
		
		yearlyincrease = C * Agr / 100;
		
		//Population After 1 - 5 years
		//first year
		
		f = C + yearlyincrease;
		
		System.out.printf("Estimated world population after one (1) year = %d\n", f);
		
		//second year
		s = f + yearlyincrease;
		
		System.out.printf("Estimated world population after two (2) years = %df\n", s);
		
		//third year
		t = s + yearlyincrease;
		
		System.out.printf("Estimated world population after three (3) years = %df\n", t);
		
		//fourth year
		fr = t + yearlyincrease;
		
		System.out.printf("Estimated world population after four (4) years = %df\n", fr);
		
		//fifth year
		ff = fr + yearlyincrease;
		
		System.out.printf("Estimated world population after five (5) years = %d   f\n", ff);
		
		}
	}

/**Current World Population is 7.837 billion (2021)

Annual world population growth rate = 0.83% from 2021 t0 2022*/
