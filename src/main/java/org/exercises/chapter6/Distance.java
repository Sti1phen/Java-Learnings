package main.java.org.example.chapter6;

import java.util.Scanner;

/*
Prompt user to Input coordinates of point 1 and 2 as x1,y1 x2,y2
Input users Response

Create method distance
d = sq.root y2-y1 sq + x2-x1sq
return distance
 */
public class Distance {
    public static void main(String[] args) {
        System.out.print("Calculation of distance between two point\n\nEnter points coordinate as x1 y1 x2 y2: ");
        Scanner input =new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.printf("The distance between the two points is: %.2f\n", distance(x1,y1,x2, y2));
    }

    public static double distance(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return distance;
    }

}
