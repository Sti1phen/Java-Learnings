package main.java.org.projects.chapter4;
/*Top - Get average mile/gallon used for all trip
 * First Refinement -
 * Initialize Variables
 * Input mile driven and gallons used trip, calculate miles/gallon
 * Calculate and print overall miles driven per gallon used for all combined trip //
 * Second Refinement -
 * Initialize totalMiles = 0
 * Initialize totalGallons = 0
 * Initialize tripCounter = 0
 *
 * Prompt user to input miles driven and gallon used for a trip
 * Input miles and gallons for each trip (or possibly enter a signal value to quit)
 * initialize miles/gallon and assign it to calculate mils/gallon for each trip
 * Add miles to Total miles
 * Add Gallons to total Gallons
 * Add 1 to tripCounter
 * Prompt user to input  next miles driven and gallon used for a trip
 * Input miles and gallons for each trip (or possibly enter a signal value to quit)
 *
 * If tripCounter is not equals 0
 *      Initialize Combined-average and assign to total-miles per total gallon
 *      Print "the Combined MilesDriven/GallonUsed for --number of Trip is ... "
 * Else
 *      Print "You did not enter miles driven used for any trip"
 */

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int totalMiles = 0;
        int totalGallon = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter miles driven and gallons used for each trip (separate by a space) or enter 0 0 to quit: ");
        int miles = input.nextInt();
        int gallons = input.nextInt();

        while (miles > 0) {
            totalMiles +=miles;
            totalGallon +=gallons;
            System.out.printf("The miles per gallon for this trip is: %.1f\n",((double)miles/gallons));
            System.out.print("Enter miles driven and gallons used for each trip (separate by a space) or enter 0 to quit: ");
            miles = input.nextInt();
            gallons = input.nextInt();
        }

        if (totalMiles != 0 && totalGallon != 0) {
            double combinedAverage = (double) totalMiles /totalGallon;
            System.out.printf("The average miles per gallon for all the trip is: %.1f.\n",combinedAverage);
        }

        else System.out.print("You did not enter any trip details!\n");
    }
}